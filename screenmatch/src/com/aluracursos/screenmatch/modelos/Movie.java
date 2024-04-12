package com.aluracursos.screenmatch.modelos;
import com.aluracursos.screenmatch.calculations.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String name, int launchDate) {
        super(name, launchDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) calcMedia() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + getLaunchDate() + ")";
    }
}
