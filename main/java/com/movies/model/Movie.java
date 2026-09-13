package com.movies.model;

public class Movie {
    private int id;
    private String title;
    private String language;
    private String genre;
    private String duration;
    private String rating;
    private String poster;

    public Movie(int id, String title, String language, String genre,
                 String duration, String rating, String poster) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.poster = poster;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getLanguage() { return language; }
    public String getGenre() { return genre; }
    public String getDuration() { return duration; }
    public String getRating() { return rating; }
    public String getPoster() { return poster; }
}
