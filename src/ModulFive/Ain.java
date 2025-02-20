package ModulFive;


import java.util.Scanner;

public class Ain {
    public static void main(String[] args) {
        double sumOfParts = 0.000000;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sumOfParts += number;
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", sumOfParts);
    }
}
