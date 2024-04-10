package com.aluracursos.screenmatch.modelos;

public class Movie {
    public String name;
    public int launchDate;
    public int durationInMinutes;
    public boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    public int getTotalOfEvaluations() {
        return totalOfEvaluations;
    }

    public void displayTechnicalSpecifications() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("It was launch on: " + launchDate);
        System.out.println("The duration in minutes is: " + durationInMinutes);
    }

    public void evaluate(double note) {
        sumOfEvaluations += note;
        totalOfEvaluations++;
    }

    public double calcMedia() {
        return sumOfEvaluations / totalOfEvaluations;
    }
}
