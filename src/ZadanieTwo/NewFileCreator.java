package ZadanieTwo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileCreator {
    public static File getFile(Path path, String nameOfFile) throws IOException {
        return Files.createFile(path.getParent().resolve(nameOfFile)).toFile();
    }
}
