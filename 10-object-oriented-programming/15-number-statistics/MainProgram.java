
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics stats=new Statistics();
        Statistics statsEven=new Statistics();
        Statistics statsOdd=new Statistics();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter numbers:");
            int input=Integer.valueOf(scan.nextLine());
            if(input==-1){
                System.out.println("Sum: "+stats.sum());
                System.out.println("Sum of even numbers:: "+statsEven.sum());
                System.out.println("Sum of odd numbers:: "+statsOdd.sum());
                break;
            }else if(input%2==0){
                statsEven.addNumber(input);
            }else if(input%2!=0){
                statsOdd.addNumber(input);
            }
            stats.addNumber(input);
        }
    }
}