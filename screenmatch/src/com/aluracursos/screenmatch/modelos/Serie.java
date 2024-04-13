package com.aluracursos.screenmatch.modelos;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Serie(String name, int launchDate) {
        super(name, launchDate);
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}
