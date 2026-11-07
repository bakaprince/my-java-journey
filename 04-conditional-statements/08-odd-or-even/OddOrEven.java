
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num=Integer.valueOf(scan.nextLine());
        
        boolean isItEven=num%2==0;
        if (isItEven){
            System.out.println("Number "+num+" is even.");
        }else{
            System.out.println("Number "+num+" is odd.");
        }
    }
}