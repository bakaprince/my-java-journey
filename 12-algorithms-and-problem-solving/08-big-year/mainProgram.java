import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;

            } else if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName));

            } else if (command.equals("Observation")) {

                System.out.print("Bird? ");
                String name = scan.nextLine();

                Bird found = null;

                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        found = bird;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("Not a bird!");
                } else {
                    found.observe();
                }

            } else if (command.equals("All")) {

                for (Bird bird : birds) {
                    System.out.println(bird);
                }

            } else if (command.equals("One")) {

                System.out.print("Bird? ");
                String name = scan.nextLine();

                Bird found = null;

                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        found = bird;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(found);
                }
            }
        }
    }
}