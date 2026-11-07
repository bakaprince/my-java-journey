
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName=scan.nextLine();
        System.out.println("Team: ");
        String team=scan.nextLine();
        int games=0;
        int wins=0;
        int losses=0;
        
        try(Scanner reader=new Scanner(Paths.get(fileName))){
            while(reader.hasNextLine()){
                String row=reader.nextLine();
                String[] parts=row.split(",");
                String homeTeam=parts[0];
                String visitingTeam=parts[1];
                int homePoints=Integer.valueOf(parts[2]);
                int visitingPoints=Integer.valueOf(parts[3]);
                
                if(team.equals(homeTeam)){
                    games++;
                    if(homePoints>visitingPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }else if(team.equals(visitingTeam)){
                    games++;
                    if(visitingPoints>homePoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                
            }
            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
