import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

        public static void downloadFile(String filePath, String location, String lock)  throws Exception {
            try {
                File file = new File(filePath);                 //creates a new file instance
                FileReader fr = new FileReader(file);           //reads the file
                BufferedReader br = new BufferedReader(fr);     //creates a buffering character input stream
                Desktop desk = Desktop.getDesktop();

                String line;
                while((line = br.readLine()) != null)
                {
                    final String[] fileName = {new String()};
                    DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(location), lock);
                    dirStream.forEach(path -> fileName[0] += path.toString());
                    File lockFile = new File(fileName[0]);

                    System.out.println(lockFile + (lockFile.exists() == true ?  " exist" : "Lockfile doesn't exist"));
                    if (lockFile.exists()==false) {
                        desk.browse(new URI(line));
                        countDown(1);
                        if (lockFile.exists()==false){
                            desk.browse(new URI(line));
                        }
                        //TimeUnit.MINUTES.sleep(15);
                        countDown(3);
                        System.out.println("DOWNLOADING for 10 minutes...");
                        System.out.println(line);
                    } else {
                        int counter = 0;
                        Long fileSize = 0L;
                        while (lockFile.exists()) {
                            counter++;
                            if (lockFile.exists()==false){
                                break;
                            } else {
                                fileSize = lockFile.length();
                                System.out.println("FILESIZE: " + fileSize);
                                countDown(1);
                                System.out.println("Loop " + counter + ": Countdown for 1 minute...");
//                            if (lockFile.length() > fileSize){
//                                fileSize = lockFile.length();
//                            } else {
//                                System.out.println("Redownloading...");
//                                desk.browse(new URI(line));
//                            }
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