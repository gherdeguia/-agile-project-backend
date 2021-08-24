package com.example.agileprojectbackend.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String availableSeats; //TODO: create another class for this list
   // @OneToOne(cascade = CascadeType.ALL, mappedBy = "id")
    private Integer movieId;
    private Time startTime;
    private Time endTime;
    private Date movieDate;

    public Screening(Integer id, String availableSeats, Integer movieId, Time startTime, Time endTime, Date movieDate) {
        this.id = id;
        this.availableSeats = availableSeats;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movieDate = movieDate;
    }

    public Screening() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(String availableSeats) {
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
