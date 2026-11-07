
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int loop=Integer.valueOf(scanner.nextLine());
        
        while(loop>0){
            printText();
            loop--;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
