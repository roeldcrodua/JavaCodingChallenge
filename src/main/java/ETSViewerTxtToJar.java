import java.io.*;
import java.nio.file.*;
public class ETSViewerTxtToJar {
    public static void main(String[] args) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get("etsviewer.txt"));
        data = java.util.Base64.getDecoder().decode(data);
        Files.write(Paths.get("etsviewer.jar"), data, new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING});
    }
}