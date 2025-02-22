package ZadanieTwo;

import java.io.File;
import java.io.IOException;

import static ZadanieTwo.Parser.*;
import static ZadanieTwo.GetPath.setPath;
import static ZadanieTwo.NewFileCreator.getFile;

public class ZadanieTwo {
    public static void main(String[] args) throws IOException {
        //"D:\\zadanie\\ecoFriendly\\data.csv"
        String nameOfNewFile = "goodPeople.txt";
        final int MAX_FOR_INDICATOR = 200;
        File goodPeopleFile = getFile(setPath(), nameOfNewFile);
        readAndWriteECO(createReader(setPath()), createWriter(goodPeopleFile), MAX_FOR_INDICATOR);
    }

}
