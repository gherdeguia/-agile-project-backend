package com.example.agileprojectbackend.dto;

import java.sql.Time;
import java.util.Date;

public class PaymentResponse {

    private String ticketNumber;
    private String movieName;
    private String cinemaName;
    private Date screeningDate;
    private Time screeningStartTime;
    private Time screeningEndTime;
    private String selectedSeats;
    private Double totalPrice;



    public PaymentResponse() {
    }

    public PaymentResponse(String ticketNumber, String movieName, String cinemaName, Date screeningDate, Time screeningStartTime, Time screeningEndTime, String selectedSeats, Double totalPrice) {
        this.ticketNumber = ticketNumber;
        this.movieName = movieName;
        this.cinemaName = cinemaName;
        this.screeningDate = screeningDate;
        this.screeningStartTime = screeningStartTime;
        this.screeningEndTime = screeningEndTime;
        this.selectedSeats = selectedSeats;
        this.totalPrice = totalPrice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }

    public Time getScreeningStartTime() {
        return screeningStartTime;
    }

    public void setScreeningStartTime(Time screeningStartTime) {
        this.screeningStartTime = screeningStartTime;
    }

    public Time getScreeningEndTime() {
        return screeningEndTime;
    }

    public void setScreeningEndTime(Time screeningEndTime) {
        this.screeningEndTime = screeningEndTime;
    }

    public String getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(String selectedSeats) {
        this.selectedSeats = selectedSeats;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
