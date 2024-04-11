package com.aluracursos.audio.models;

public class MyFavourites {
    public void add(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println(audio.getTitle() + " is one of the popular songs");
        } else {
            System.out.println(audio.getTitle() + " is not as popular");
        }
    }
}
