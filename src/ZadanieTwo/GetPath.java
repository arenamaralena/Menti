package ZadanieTwo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GetPath {
    public static Path setPath() {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());
        scanner.close();
        return path;
    }
}
