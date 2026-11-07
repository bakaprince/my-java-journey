
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String itemName=scanner.nextLine();
            
            if(itemName.equals("")){
                break;
            }
            Item item=new Item(itemName);
            items.add(item);
        }
        for(Item item: items){
            System.out.println(item.toString());
        }

    }
}
