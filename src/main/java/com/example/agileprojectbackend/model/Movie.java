package com.example.agileprojectbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;
    private String name;
    private String synopsis;
    private String directedBy;
    private String rated;
    private Time runningTime;
    private List<String> genre;
    private Date releaseDate;
    private List<String> castAndCrews;
    private String poster;

    public Movie(Integer movieId, String name, String synopsis, String directedBy, String rated, Time runningTime, List<String> genre, Date releaseDate, List<String> castAndCrews, String poster) {
        this.movieId = movieId;
        this.name = name;
        this.synopsis = synopsis;
        this.directedBy = directedBy;
        this.rated = rated;
        this.runningTime = runningTime;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.castAndCrews = castAndCrews;
        this.poster = poster;
    }

    public Movie() {
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public Time getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Time runningTime) {
        this.runningTime = runningTime;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getCastAndCrews() {
        return castAndCrews;
    }

    public void setCastAndCrews(List<String> castAndCrews) {
        this.castAndCrews = castAndCrews;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
