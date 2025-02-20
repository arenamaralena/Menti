package ModulFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class ZadanieTwo {
    public static void findECO(Path path, int maxCount) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
        Path goodPeople = Files.createFile(path.getParent().resolve("goodPeople.txt"));
        FileWriter writer = new FileWriter(goodPeople.toFile());

        String line;
        String header = reader.readLine();
        writer.write(header);
        writer.write("\n");
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\\|");
            int countOfBadIndicator = 0;
            for (int columnNumber = 2; columnNumber < values.length; columnNumber++) {
                if (parseInt(values[columnNumber]) > maxCount) {
                    countOfBadIndicator++;
                }
            }
            if (countOfBadIndicator == 0) {
                writer.write(line);
                writer.write("\n");
            }
        }
        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\zadanie\\ecoFriendly\\data.csv");
        findECO(path, 200);
    }

}
