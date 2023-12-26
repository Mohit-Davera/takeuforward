package testing.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTest {
    public static void main(String[] args) throws IOException {
        Path namesPath = Path.of("/home/mohit/Desktop/takeuforward/design-patterns/src/names.txt");

        Path namesPath2 = Path.of("/home/mohit/Desktop/takeuforward/design-patterns/src").resolve("names.txt");
        boolean exists = Files.exists(namesPath);
        boolean exists2 = Files.exists(namesPath2);
        System.out.println(Files.getPosixFilePermissions(namesPath));
        System.out.println(Files.getLastModifiedTime(namesPath2));
        System.out.println(Files.getLastModifiedTime(namesPath));
//        Files.createTempFile(namesPath.getParent(),"temp_112",".txt");
//        Files.createTempDirectory(namesPath.getParent(),"temp");
    }
}
