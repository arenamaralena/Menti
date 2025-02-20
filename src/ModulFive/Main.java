package ModulFive;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int windows;
        int buffer;
        int symbolR = 13;
        int symbolN = 10;

        while ((windows = System.in.read()) != -1) {
            if (windows == symbolR) {
                if ((buffer = System.in.read()) == symbolN) {
                    System.out.write(buffer);
                } else {
                    System.out.write(windows);
                    System.out.write(buffer);
                }
            } else {
                System.out.write(windows);
            }
        }
        System.out.flush();
    }
}
