import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the name of your favourite movie");
        String movie = keyboard.nextLine();
        System.out.println("Now write the launch date");
        int launchDate = keyboard.nextInt();
        System.out.println("Finally, tell us what rating you give to this movie");
        double rating = keyboard.nextDouble();

        System.out.println(movie);
        System.out.println(launchDate);
        System.out.println(rating);
    }
}
