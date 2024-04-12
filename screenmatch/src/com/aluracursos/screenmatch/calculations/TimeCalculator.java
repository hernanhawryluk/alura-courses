package com.aluracursos.screenmatch.calculations;
import com.aluracursos.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Title title) {
        System.out.println("Adding the duration in minutes of: " + title);
        this.totalTime += title.getDurationInMinutes();
    }
}
