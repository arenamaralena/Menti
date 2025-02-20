package ModulFive;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class ZadanieOne {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Paths.get(scanner.nextLine());
        Files.walkFileTree(directory, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path startDirectory, BasicFileAttributes attrs) throws IOException {
                if (!startDirectory.equals(directory)) {
                    Path jokeFile = startDirectory.resolve("joke.java");
                    if (!Files.exists(jokeFile)) {
                        Files.createFile(jokeFile);
                        Files.writeString(jokeFile, "public class Main {\npublic static void main(String[] args) {\n" +
                                "        System.out.println(\"hello word\");\n" +
                                "    }\n" +
                                "}");
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
}