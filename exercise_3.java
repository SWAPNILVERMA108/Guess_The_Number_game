// create a class game , which allow a user to play "Guess the Number" game once
// game should have the following methods
// 1. constructor
// 2. takeUserInput() to take a user input of number
// 3. isCorrectNumber() to detect whether the number entered by the user is true
// 4. getter and setter for noOfGuesses
//    use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
      Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("GUESS THE NO :");
        Scanner sc  = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber== number){
            System.out.println("Congratulations ! You guess the correct No");
            return true;
        }
        else if(inputNumber<number){
            System.out.println("You have chosen smaller No");
        }
        else if(inputNumber>number){
            System.out.println("You have chosen bigger No");
        }
        return false;
    }
}
public class exercise_3 {
    public static void main(String[] args) {
Game g = new Game();
boolean b = false;
while (!b) {
    g.takeUserInput();
    b = g.isCorrectNumber();
    System.out.println(b);
      }
    }
}
