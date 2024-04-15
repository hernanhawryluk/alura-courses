import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        MovieQuery query = new MovieQuery();
        System.out.println("Write the number of the Star Wars Movie:");
        try {
            var numberOfMovie = Integer.valueOf(prompt.nextLine());
            Movie movie = query.searchMovie(numberOfMovie);
            System.out.println(movie);
            FileGenerator writer = new FileGenerator();
            writer.saveJson(movie);
        } catch (NumberFormatException e) {
            System.out.println("Number of Movie not found.");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Exiting the application.");
        }
    }
}