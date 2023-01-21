import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissor";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playAgain = " ";

        while (!playAgain.equals("n")) {
            System.out.println("Choose [r]ock, [p]aper, [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock") || playerMove.equals("Rock")) {
                playerMove = ROCK;
            } else if (playerMove.equals("p") || playerMove.equals("paper") || playerMove.equals("Paper")) {
                playerMove = PAPER;
            } else if (playerMove.equals("s") || playerMove.equals("scissors") || playerMove.equals("Scissors")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid Input. Try again...");
                return;
            }

            Random random = new Random();

            int computerRandomNumber = random.nextInt(3);
            String computerMove = "";
            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;

            }
            System.out.printf("The computer chose %s.%n", computerMove);
            if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {

                System.out.println("You win.");
                System.out.println("Do you want to play again?: y/n");

                playAgain = scanner.nextLine();

            } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
                System.out.println("You lose.");
                System.out.println("Do you want to play again?: y/n");

                playAgain = scanner.nextLine();
            } else {
                System.out.println("This game was a draw.");
                System.out.println("Do you want to play again?: y/n");

                playAgain = scanner.nextLine();
            }
        }
    }
}