
import java.util.Scanner;
import java.util.Arrays;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username={"alex","emma"};
        String[] password={"sunshine","haskell"};
        System.out.println("Enter username: ");
        String user_input=scanner.nextLine();
        System.out.println("Enter password: ");
        String pwd_input=scanner.nextLine();
        
        if(user_input.equals(username[0]) && pwd_input.equals(password[0])){
            System.out.println("You have successfully logged in!");
        }else if(user_input.equals(username[1]) && pwd_input.equals(password[1])){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
        
    }
}
