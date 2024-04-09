import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        double rating = 0;
        double mediaRating = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Write the rating that you would give to the movie Matrix");
            rating = keyboard.nextDouble();
            mediaRating = mediaRating + rating;
        }
        mediaRating = (double) mediaRating / 3;
        System.out.println("The media rating is " + mediaRating + " for the movie Matrix");
    }
}
