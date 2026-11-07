
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points= new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            if(num>=0 &&num<=100){
                points.add(num);
            }
        }
        System.out.println("Point average (all): "+average(points));
        System.out.println("Point average (passing): "+passingAverage(points));
        System.out.println("Pass percentage: "+passingPercent(points));
        gradeDistribution(points);
        
        
    }
    public static double average(ArrayList<Integer> points){
        int sum=0;
        double count=0.0;
        
        for(int point:points){
            sum+=point;
            count++;
        }
        return sum/count;
    }
    public static String passingAverage(ArrayList<Integer> points){
        int sum=0;
        double count=0.0;
        for(int point:points){
            if(point>=50){
                sum+=point;
                count++;
            }
        }
        double avg=sum/count;
        if(count==0){
            return "-";
        }else{
            return String.valueOf(avg);
        }
    }
    public static double passingPercent(ArrayList<Integer> points){
        double count=0.0;
        
        for(int point:points){
            if(point>=50){
                count++;
            }
        }
        double passingPercent=100*(count/points.size());
        return passingPercent;
    }
    public static int grade(int points){
        if(points < 50){
            return 0;
        } else if(points < 60){
            return 1;
        } else if(points < 70){
            return 2;
        } else if(points < 80){
            return 3;
        } else if(points < 90){
            return 4;
        }
        return 5;
    }
    public static void gradeDistribution(ArrayList<Integer> points){
        int[] grades=new int[6];
        
        for(int point:points){
            
            grades[grade(point)]++;
        }    
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(int j = 0; j < grades[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}