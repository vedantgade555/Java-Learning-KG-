import java.util.Scanner;

/* Create a number guessing game where the program selects a
random number, and the user has to guess it */
class GuessingGame {

    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Guess the num between 1 to 100");
        int guess;
        int result;
        do {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);

            if(result == 0){
                System.out.println("Your Guess is Correct");
            }else if (result<0){
                System.out.println("Please Guess Higher");
            }
            else {
                System.out.println("Please Guess lower");
            }
        }while (result != 0);

    }
}
