package com.aluracursos.audio.models;

public class Audio {
    private String title;
    private int durationInMinutes;
    private int totalReproductions;
    private int likes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void iLike() {
        this.likes++;
    }

    public void play() {
        this.totalReproductions++;
    }

    public void stop() {
        System.out.println("The playback has stopped");
    }
}
