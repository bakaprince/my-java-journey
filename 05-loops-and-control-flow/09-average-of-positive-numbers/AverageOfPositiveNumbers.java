
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0) {
                sum += num;
                count++;
            } else if (num == 0) {

                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    double avg = (double) sum / count;
                    System.out.println("Average of the numbers: " + avg);
                }
                break;
            }
        }
    }
}