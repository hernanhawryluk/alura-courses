import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Encanto");
        myMovie.setLaunchDate(2021);
        myMovie.setDurationInMinutes(120);

        myMovie.displayTechnicalSpecifications();
        myMovie.evaluate(10);
        myMovie.evaluate(8.5);
        myMovie.evaluate(7.8);

        System.out.println("The total of the evaluations is: " + myMovie.getTotalOfEvaluations());
        System.out.println("The rating of the movie is: " + myMovie.calcMedia());

        Serie houseDragon = new Serie();
        houseDragon.setName("La casa del dragón");
        houseDragon.setLaunchDate(2022);
        houseDragon.setSeasons(1);
        houseDragon.setMinutesPerEpisode(50);
        houseDragon.setEpisodesPerSeason(10);

        houseDragon.displayTechnicalSpecifications();

    }
}