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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "screening_id")
    private List<Seat> seats;
    private Integer cinemaId;
    private Integer movieId;

    public Screening(Integer id, String availableSeats, List<Cinema> cinemas, Time startTime, Time endTime, Date movieDate, List<Seat> seats, Integer cinemaId, Integer movieId) {
        this.id = id;
        this.availableSeats = availableSeats;
        this.cinemas = cinemas;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movieDate = movieDate;
        this.seats = seats;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
    }

//    public Screening(Integer id, String availableSeats, List<Cinema> cinemas, Time startTime, Time endTime, Date movieDate, List<Seat> seats) {
//        this.id = id;
//        this.availableSeats = availableSeats;
//        this.cinemas = cinemas;
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.movieDate = movieDate;
//        this.seats = seats;
//    }

    public Screening(Integer id, String availableSeats, Time startTime, Time endTime, Date movieDate, List<Seat> seat_id) {
        this.id = id;
        this.availableSeats = availableSeats;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movieDate = movieDate;
        this.seats = seat_id;
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


    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
