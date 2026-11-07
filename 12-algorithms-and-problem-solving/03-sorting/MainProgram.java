import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        sort(numbers);
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for(int num:array){
            if(num<smallest){
                smallest=num;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallestIndex=0;
        for(int i=0; i<=array.length-1;i++){
            if(array[i]<array[smallestIndex]){
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }
    public static int indexOfSmallestFrom(int[] array,int startIndex){
        int smallestIndex=startIndex;
        for(int i=startIndex; i<=array.length-1;i++){
            if(array[i]<array[smallestIndex]){
                smallestIndex=i;
            }
        }
        return smallestIndex;
        
    }
    public static void swap(int[] array, int index1, int index2){
        int temp=array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
    
    }
    public static void sort(int[] array) {
        for(int i=0;i<=array.length-1;i++){
            int small=indexOfSmallestFrom(array,i);
            swap(array,small,i);
            
            System.out.println(Arrays.toString(array));
        }
    }
}
