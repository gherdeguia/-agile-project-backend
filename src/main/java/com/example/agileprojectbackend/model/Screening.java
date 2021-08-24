package com.example.agileprojectbackend.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String availableSeats; //TODO: create another class for this list
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Cinema> cinemas;
    private Time startTime;
    private Time endTime;
    private Date movieDate;

    public Screening(Integer id, String availableSeats, Time startTime, Time endTime, Date movieDate) {
        this.id = id;
        this.availableSeats = availableSeats;
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

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}
