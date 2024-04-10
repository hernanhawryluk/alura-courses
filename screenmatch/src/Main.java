import com.aluracursos.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Encanto";
        myMovie.launchDate = 2021;
        myMovie.durationInMinutes = 120;

        myMovie.displayTechnicalSpecifications();
        myMovie.evaluate(10);
        myMovie.evaluate(8.5);
        myMovie.evaluate(7.8);

        System.out.println("The total of the evaluations is: " + myMovie.getTotalOfEvaluations());
        System.out.println("The rating of the movie is: " + myMovie.calcMedia());
    }
}