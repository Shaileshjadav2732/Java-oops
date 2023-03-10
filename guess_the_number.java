package oops;
import java.util.Random;
import java.util.Scanner;

class game {
    public int numberinguesse=0;
    public int number;
    public int inputnumber;
    public int computerinput;

    public int getNumberinguesse() {
        return numberinguesse;
    }

    public void setNumberinguesse(int numberinguesse) {
        this.numberinguesse = numberinguesse;
    }


     game() {
        Random rand = new Random();

        this.number = rand.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

  boolean iscorrectnumber() {
        numberinguesse++;
        if (inputnumber == number) {
            System.out.format("Yes %d is yours number",number);
            System.out.println();
            System.out.format("you guess in %d trys",numberinguesse);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too less...");
        } else if (inputnumber > number) {
            System.out.println("Too high...");

        }
        return false;

    }
}
    public class guess_the_number {
        public static void main(String[] args) {
            game g = new game();
            boolean b=false;
            while(!b) {
                g.takeuserinput();
                b = g.iscorrectnumber();
            }
        }
    }
