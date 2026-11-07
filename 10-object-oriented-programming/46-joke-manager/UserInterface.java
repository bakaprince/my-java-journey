
import java.util.Scanner;
public class UserInterface {
    
    private Scanner scanner;
    private JokeManager jm;
    
    public UserInterface(){
        
        this.scanner = new Scanner(System.in);
        this.jm = new JokeManager();
    }
    public UserInterface(JokeManager jm ,Scanner sc){
        this.scanner=sc;
        this.jm=jm;
    }
    public void start(){
        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.jm.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jm.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jm.printJokes();
            }
        }
    }
}

