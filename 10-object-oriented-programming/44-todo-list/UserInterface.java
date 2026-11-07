import java.util.Scanner;
public class UserInterface {
    private TodoList taskList;
    private Scanner scanner;
    
    public UserInterface(TodoList taskList,Scanner scanner){
        this.scanner=scanner;
        this.taskList=taskList;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command=this.scanner.nextLine();
        
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.println("To add: ");
                String task=this.scanner.nextLine();
                this.taskList.add(task);
            }else if(command.equals("list")){
                this.taskList.print();
            }else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int input=Integer.valueOf(scanner.nextLine());
                this.taskList.remove(input);
            }
            
        }
        
    }
}
