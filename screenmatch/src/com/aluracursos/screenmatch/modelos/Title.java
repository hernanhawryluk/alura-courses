package com.aluracursos.screenmatch.modelos;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    public Title(String name, int launchDate) {
        this.name = name;
        this.releaseDate = launchDate;
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
}
