
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(number>0){
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        while(number>0){
            System.out.print(" ");
            number--;
        }    
    }

    public static void printTriangle(int size) {
        int i=1;
        int c=0;
        while(c<size){
            printSpaces(size-1-c);
            printStars(i);
            c++;
            i++;
        }
    }

    public static void christmasTree(int height) {
        int stars=1;
        int spaces=height-1;
        while(stars<=height*2-1){
            printSpaces(spaces);
            printStars(stars);
            stars+=2;
            spaces--;
        }
        int i=0;
        while(i<2){
            printSpaces(height-2);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
