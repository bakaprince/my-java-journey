import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title=scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pgNum=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear=Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(title,pgNum,pubYear));
        }
        System.out.println("What information will be printed?");
        String input=scanner.nextLine();
        for(Book book: bookList){
            if(input.equals("everything")){
                System.out.println(book.toString());
            }else if(input.equals("name")){
                System.out.println(book.getTitle());
            }
        }
        
    }
}
