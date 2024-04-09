import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        int lifes = 10;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Guess the number from 0 to 100");

        while (lifes > 0) {
            int guess = keyboard.nextInt();
            if (guess == num) {
                System.out.println("You are right, the number was " + num);
                return;
            } else if (guess < num) {
                System.out.println("The number is higher than that");
            } else {
                System.out.println("The number is lower than that");
            }
            lifes--;
        }
        System.out.println("You lost all your lifes, the number was " + num);
    }
}
