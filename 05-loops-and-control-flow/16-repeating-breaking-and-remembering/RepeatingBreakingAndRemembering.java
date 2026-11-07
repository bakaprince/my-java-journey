
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=0;
        double avg=0.0;
        int even=0;
        int odd=0;
        while(true){
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num==-1){
                avg=sum/(count*1.0);
                System.out.println("Thx! Bye!"); 
                System.out.println("Sum: "+sum);
                System.out.println("Numbers: "+count);
                System.out.println("Average: "+avg);
                System.out.println("Even: "+even);
                System.out.println("Odd: "+odd);
                break;
            }else{
                sum+=num;
                count+=1;
                if(num%2==0){
                    even+=1;
                }else{
                    odd+=1;
                }
            }
        }
    }
}
