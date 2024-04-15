package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021, 50);
        myMovie.evaluate(9);
        Movie otherMovie = new Movie("Matrix", 1998, 60);
        otherMovie.evaluate(6);
        var movieOfBruno = new Movie("El señor de los anillos", 2001, 180);
        movieOfBruno.evaluate(10);
        Serie houseDragon = new Serie("La casa del dragón", 2022, 120);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(otherMovie);
        list.add(movieOfBruno);
        list.add(houseDragon);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println(movie.getClassification());
            }

        }

        List<String> listOfArtists = new ArrayList<>();
        listOfArtists.add("Penelope Cruz");
        listOfArtists.add("Antonio Banderas");
        listOfArtists.add("Ricardo Darin");
        System.out.println("Unsorted List of the Artist: " + listOfArtists);

        Collections.sort(listOfArtists);
        System.out.println("Sorted List of the Artist: " + listOfArtists);

        Collections.sort(list);
        System.out.println("Sorted List of Movies: " + list);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Sorted List of Movies by release date: " + list);
    }
}
