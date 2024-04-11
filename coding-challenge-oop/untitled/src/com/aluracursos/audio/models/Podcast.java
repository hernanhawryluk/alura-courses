package com.aluracursos.audio.models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassification() {
        if (getTotalReproductions() > 2000) {
            return 9;
        } else {
            return 2;
        }
    }
}
