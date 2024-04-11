package com.aluracursos.screenmatch.calculations;

public class RecommendationFilter {
    public void filter (Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("It's a recommended movie");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Popular at the moment");
        } else {
            System.out.println("Add it to your list to watch it later");
        }
    }
}
