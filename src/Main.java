import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 6;



        System.out.println("I'm thinking of a number between 1 and 10. Try to guess it...");
        System.out.print("Your guess: ");
        guess = input.nextInt();

        while ( guess != secretNumber)
        {
            System.out.println("\nThat is incorrect. Guess again.");
            System.out.println("Your guess: ");
            guess = input.nextInt();
        }
        System.out.println();
        System.out.println("That's right!!! You're a good guesser!");
        input.close();


    }

}
