package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseDate = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 2));
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
        return "name='" + name + "', ReleaseDate=" + releaseDate + ", runtime=" + durationInMinutes;
    }
}
