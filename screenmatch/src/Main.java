import com.aluracursos.screenmatch.calculations.RecommendationFilter;
import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.modelos.Episode;
import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto");
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

        Movie otherMovie = new Movie("Matrix");
        otherMovie.setLaunchDate(1998);
        otherMovie.setDurationInMinutes(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(myMovie);
        calculator.add(otherMovie);
        calculator.add(houseDragon);
        System.out.println("The total time for your favourite titles is: " + calculator.getTotalTime() + " minutes.");;

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        System.out.println(myMovie.getName());
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("La casa Targaryen");
        episode.setSerie(houseDragon);
        episode.setTotalVisualizations(50);
        System.out.println(episode.getName());
        recommendationFilter.filter(episode);

        var movieOfBruno = new Movie("El señor de los anillos");
        movieOfBruno.setDurationInMinutes(180);
        movieOfBruno.setLaunchDate(2001);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(myMovie);
        moviesList.add(otherMovie);
        moviesList.add(movieOfBruno);

        System.out.println("Size of the List: " + moviesList.size());
        System.out.println("The first movie is: " + moviesList.get(0).getName());

        System.out.println(moviesList);
        System.out.println("toString() of the Movie: " + moviesList.get(0).toString());
    }
}