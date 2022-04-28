import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;


import java.awt.Desktop;
import java.io.*;
import java.io.File;
import java.net.URI;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;


public class OpenBrowserApp {

        public static String sourcePath = "C:\\Users\\roeld\\Documents\\ToDownload.txt";
        public static String location = "D:\\MOVIES";
        public static String lock = "*.crdownload";


        public static void main(String[] args) throws Exception {
            downloadFile(sourcePath, location, lock);
        }

        public static boolean checkIfLockFileExist() throws IOException {
            List<String> lockFiles = new ArrayList<>();
            DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(location), lock);
            for (Path p: dirStream){
                lockFiles.add(p.toString());
            }
            return lockFiles.size() > 0;
        }

        public static void downloadFile(String filePath, String location, String lock)  throws Exception {
            try {
                File file = new File(filePath);                 //creates a new file instance
                FileReader fr = new FileReader(file);           //reads the file
                BufferedReader br = new BufferedReader(fr);     //creates a buffering character input stream
                Desktop desk = Desktop.getDesktop();

                boolean running = false;
                String line;
                while((line = br.readLine()) != null)
                {
                    if (!running) {
                        desk.browse(new URI(line));
                        System.out.println(line);
                        countDown(2);
                    }
                    if (!checkIfLockFileExist()) {
                        System.out.println(line);
                        desk.browse(new URI(line));
                        countDown(1);
                        if (checkIfLockFileExist()) {
                            running = true;
                        } else {
                            running = false;
                        }
                    }else {
                        running = true;
                        countDown(1);
                    }

                    int counter = 0;
                    long fileSize = 0L;

                    while (running){
                        counter++;
                        if (!checkIfLockFileExist()){
                            System.out.println("Break");
                            break;
                        } else {
                            String[] fileName = {new String()};
                            DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(location), lock);
                            dirStream.forEach(path -> fileName[0] = path.toString());
                            fileSize = Files.size(Paths.get(fileName[0]));
                            System.out.println(fileName[0] + " --> " + fileSize);

                            countDown(1);
                            System.out.println("Loop " + counter + ": Countdown for 1 minute...");
                            try {
                                if (Files.size(Paths.get(fileName[0])) > fileSize) {
                                    fileSize = Files.size(Paths.get(fileName[0]));
                                    System.out.println(fileName[0] + " --> " + fileSize);
                                    running = true;
                                    countDown(1);
                                    System.out.println("Loop " + counter + ": Countdown for 1 minute...");
                                } else {
                                    break;
                                }
                            } catch (NoSuchFileException ex){
                                break;
                            }
                        }
                    }
                }
                fr.close();    //closes the stream and release the resources
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        public static void countDown(int minutes) throws InterruptedException {
            int minute = 0;
            for (int sec = minutes * 60; sec >= 0 ; sec--){
                TimeUnit.SECONDS.sleep(1);
                minute++;
                if (minute >= 60){
                    System.out.println(sec + " ");
                    minute = 0;
                } else {
                    System.out.print(sec + " ");
                }
            }
        }
    }