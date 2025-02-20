package ModulFive;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Five {
    private static final byte[] testSet1 = new byte[]{10, 20, 30, 50, 1, 125};
    private static final byte[] testSet2 = new byte[]{111, -45, 0, -2, 58, -1};
    private static final byte[] testSet3 = new byte[]{0, 0, 0, 0, 0, 0};
    private static final byte[] testSet4 = new byte[]{-1, -1, -1, -1, -1, -1};

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int controlSum = 0;
        int numberInN;
        while ((numberInN = inputStream.read()) != -1) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ numberInN;
        }
        return controlSum;
    }

    public static void main(String[] args) throws IOException {

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = objectInputStream.readInt();
            animals = new Animal[size];
            int count = 0;
            while (count < size) {
                animals[count] = (Animal) objectInputStream.readObject();
                count++;
            }
            return animals;
        } catch (RuntimeException | IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }
}

class Assertions {

    public static void assertEquals(int value, int expected, String msg) {

        if (value != expected) System.out.printf("%s: Error! Expected %d, got %d.\n", msg, expected, value);
        else System.out.printf("%s: Ok\n", msg);
    }
}