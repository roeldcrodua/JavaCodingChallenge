import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class HtmlPageDownloader {
    public static String sourcePath = "C:\\Users\\Roel\\Documents\\ToDownload.txt";
    public static String location = "C:\\Users\\Roel\\Downloads\\";
    public static String lock = "downloaded-file";


    public static void main(String[] args) throws Exception {
        downloadFile(sourcePath, location, lock);
    }

    public static void downloadFile(String filePath, String location, String lock)  throws Exception {
        try {
            File file = new File(filePath);                 //creates a new file instance
            FileReader fr = new FileReader(file);           //reads the file
            BufferedReader br = new BufferedReader(fr);     //creates a buffering character input stream
            //Desktop desk = Desktop.getDesktop();

            String URL_List;
            Integer num = 1;
            while((URL_List = br.readLine()) != null) {
                System.out.println(URL_List);
                String fileName = location + num + ".mp4";

                try {
                    //downloadUsingNIO(URL_List, "/Users/pankaj/sitemap.xml");
                    downloadUsingStream(URL_List, fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                num++;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        System.out.println("DOWNLOADING...");
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            System.out.print(".");
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}
