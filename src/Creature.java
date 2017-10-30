/**
 * Created by k1763934 on 30/10/17.
 */
public class Creature {
    private int energy, fullness, happiness;
    private String name;


    public Creature (String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;

    }

    public void eat(){
        if(fullness >= 12)
            System.out.println("Whoops, " + this.getName() + " is already full");

        else {
            fullness += 8;
            happiness -= 5;
            energy -= 5;
        }
        if (fullness>15)
            fullness = 15;
        System.out.println("Nice meal!");
    }


    public void sleep(){
        if(energy >= 12)
            System.out.println("Whoops, " + this.getName() + " is not sleepy");

        else {
            fullness -= 5;
            happiness -= 5;
            energy += 8;
        }
        if (energy>15)
            energy = 15;
        System.out.println("Wow, "+ this.getName()+" slept quite a bit!");
    }


    public void play(){
        fullness -= 5;
        happiness += 8;
        energy -= 5;

    if (happiness>15)
        happiness = 15;
    System.out.println("It was fun!");

    }


    public String checkStatus(){
        String status ="";

        if(happiness <= 6)
            status+="Oh, "+this.getName()+" is very sad\n";
        if (energy <= 6)
            status+="Oh, "+this.getName()+" is very tired\n";
        if (fullness <= 6)
            status+="Oh, "+this.getName()+" is very hungry\n";
        if (happiness <= 0 || energy <= 0 || fullness <= 0){

            System.out.println("NOOOO, "+ this.getName()+" has died... my deepest condolences");
            System.exit(0);
        }
        return status;
    }

    public String getName() {
        return name;
    }
}
