import java.util.Random;
import java.util.Scanner;

class Game{
    public int inputNumber;
    public int randNum;
    public int noOfGuesses = 0;

    public Game(){
        Random rand = new Random();
        this.randNum = rand.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number :- ");
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==randNum){
            System.out.printf("Yes you guessed it right, it was %d\n You guessed it in %d attempt ",randNum,noOfGuesses);
            return true;
        } else if (inputNumber<randNum) {
            System.out.println("Too low...");
        } else if (inputNumber>randNum) {
            System.out.println("Too High...");
        }
        return false;
    }
}
public class Mygame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }


    }
}
