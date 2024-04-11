package com.aluracursos.screenmatch.modelos;

public class Title {
    private String name;
    private int launchDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    public String getName() {
        return name;
    }

    public int getLaunchDate() {
        return launchDate;
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

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalOfEvaluations() {
        return totalOfEvaluations;
    }

    public void displayTechnicalSpecifications() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("It was launch on: " + launchDate);
        System.out.println("The duration in minutes is: " + getDurationInMinutes());
    }

    public void evaluate(double note) {
        sumOfEvaluations += note;
        totalOfEvaluations++;
    }

    public double calcMedia() {
        return sumOfEvaluations / totalOfEvaluations;
    }
}
