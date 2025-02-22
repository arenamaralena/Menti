package ZadanieTwo;

import java.io.*;
import java.nio.file.Path;

import static ZadanieTwo.DataFilter.lookForBadIndicator;

public class Parser {
    public static BufferedReader createReader (Path path) throws FileNotFoundException {
        return new BufferedReader(new FileReader(path.toFile()));
    }

    public static FileWriter createWriter(File file) throws IOException {
        return new FileWriter(file);
    }

    public static void readAndWriteECO(BufferedReader reader, FileWriter writer, int maxCount) throws IOException {
        String header = reader.readLine();
        writer.write(header);
        writer.write("\n");
        final int NO_BAD_INDICATOR = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\\|");
            if (lookForBadIndicator(values, maxCount) == NO_BAD_INDICATOR) {
                writer.write(line);
                writer.write("\n");
            }
        }
        reader.close();
        writer.close();
    }
}
