package ModulFive;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class ZadanieOne {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "joke.java";
        String text = "public class Main {\npublic static void main(String[] args) {\n" +
                "       System.out.println(\"hello word\");\n" +
                "    }\n" +
                "}";
        Path directory = getPath();
        createFileWithText(directory, nameOfFile, text);
    }

    public static Path getPath() {
        Scanner scanner = new Scanner(System.in);
        return Paths.get(scanner.nextLine());
    }

    public static void createFileWithText(Path path, String nameOfNewFile, String text) throws IOException {
        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path startDirectory, BasicFileAttributes attrs) throws IOException {
                if (!startDirectory.equals(path)) {
                    Path pathToNewFile = startDirectory.resolve(nameOfNewFile);
                    if (!Files.exists(pathToNewFile)) {
                        Files.createFile(pathToNewFile);
                        Files.writeString(pathToNewFile, text);
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
}