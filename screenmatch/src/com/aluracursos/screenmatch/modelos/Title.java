package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exceptions.ErrorInConversionOfRuntimeException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseDate = Integer.valueOf(myTitleOmdb.year());
        if(myTitleOmdb.runtime().contains("N/A")) {
            throw new ErrorInConversionOfRuntimeException("Was not able to convert the runtime because contains 'N/A'");
        }
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 3).replace(" ", ""));
    }

    public Title(String name, int releaseDate, int durationInMinutes) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int launchDate) {
        this.releaseDate = launchDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalOfEvaluations() {
        return totalOfEvaluations;
    }

    public void displayTechnicalSpecifications() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("It was launch on: " + releaseDate);
        System.out.println("The duration in minutes is: " + getDurationInMinutes());
    }

    public void evaluate(double note) {
        sumOfEvaluations += note;
        totalOfEvaluations++;
    }

    public double calcMedia() {
        return sumOfEvaluations / totalOfEvaluations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(name=" + name + ", ReleaseDate=" + releaseDate + ", runtime=" + durationInMinutes + ")";
    }
}
