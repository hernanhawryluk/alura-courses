import java.util.Scanner;

public class Evaluations {
    public static void main(String[] args) {
        double rating = 0;
        double mediaRating = 0;
        int iteration = 0;
        Scanner keyboard = new Scanner(System.in);

        while (rating != -1) {
            System.out.println("Write the rating that you would give to the movie Matrix");
            rating = keyboard.nextDouble();
            if (rating != -1) {
                mediaRating += rating;
                iteration++;
            }
        }
        mediaRating = (double) mediaRating / iteration;
        System.out.println("The media rating is " + mediaRating + " for the movie Matrix");
    }
}

