package com.example.agileprojectbackend.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

//@Entity
public class Screening {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer screeningId;
    private List<String> availableSeats;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "movieId")
    private Integer movieId;
    private Time startTime;
    private Time endTime;
    private Date movieDate;

    public Screening(Integer screeningId, List<String> availableSeats, Integer movieId, Time startTime, Time endTime, Date movieDate) {
        this.screeningId = screeningId;
        this.availableSeats = availableSeats;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movieDate = movieDate;
    }

    public Screening() {
    }

    public Integer getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Integer screeningId) {
        this.screeningId = screeningId;
    }

    public List<String> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<String> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }
}
