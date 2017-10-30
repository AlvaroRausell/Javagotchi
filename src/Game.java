/**
 * Created by Alvaro Rausell on 30/10/17.
 */
import java.util.Scanner;

public class Game {

    boolean usrQuits = false;
    Creature creature;
    Scanner scanner = new Scanner (System.in);

    public void run(){


        startTutorial();
        while (!usrQuits){
            interact();
            System.out.println(this.creature.checkStatus());
        }
        System.out.println("Time to say goodbye to "+this.creature.getName());
    }

    private void interact(){
        System.out.println("What would you like to do?");
        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                this.creature.play();
                break;
            case 2:
                this.creature.sleep();
                break;
            case 3:
                this.creature.sleep();
                break;
            case 4:
                usrQuits = true;
                break;
            default:
                System.out.println("Whoops, I didn't get that!");
                break;
            }
    }

    private void startTutorial(){
        System.out.println("Hello! Welcome to Javagotchi. What's the name of your creature?");

        String name = scanner.nextLine();
        this.creature = new Creature(name);
        System.out.println("Congratulations! You have met "+ this.creature.getName()+"!");
    }
}
