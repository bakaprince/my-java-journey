import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary sd;
    
    public TextUI(Scanner scanner,SimpleDictionary sd){
        this.scanner=scanner;
        this.sd=sd; 
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input=this.scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(input.equals("add")){
                System.out.println("Word: ");
                String word=this.scanner.nextLine();
                System.out.println("Translation: ");
                String translation=this.scanner.nextLine();
                
                this.sd.add(word, translation);
                continue;
            }else if(input.equals("search")){
                System.out.println("Word: ");
                String word=this.scanner.nextLine();
                String translation=sd.translate(word);
                if(translation==null){
                    System.out.println("Word "+word+" was not found");
                }else{
                System.out.println("Translation: "+translation);
                }
                continue;
            }
            System.out.println("Unknown command");
        }
        
        
    }
}
