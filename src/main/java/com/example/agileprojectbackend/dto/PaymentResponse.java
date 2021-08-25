package com.example.agileprojectbackend.dto;

import java.sql.Time;
import java.util.Date;

public class PaymentResponse {

    private String fullName;
    private String email;
    private Integer contactDetail;
    private Integer cardDetail;
    private String cardHolderName;
    private Integer cardExpiration;
    private Integer cardCode;
    private String movieName;
    private String cinemaName;
    private Date screeningDate;
    private Time screeningTime;
    private String selectedSeats;
    private Double totalPrice;

    public PaymentResponse() {
    }

    public PaymentResponse(String fullName, String email, Integer contactDetail, Integer cardDetail, String cardHolderName, Integer cardExpiration, Integer cardCode, String movieName, String cinemaName, Date screeningDate, Time screeningTime, String selectedSeats, Double totalPrice) {
        this.fullName = fullName;
        this.email = email;
        this.contactDetail = contactDetail;
        this.cardDetail = cardDetail;
        this.cardHolderName = cardHolderName;
        this.cardExpiration = cardExpiration;
        this.cardCode = cardCode;
        this.movieName = movieName;
        this.cinemaName = cinemaName;
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
        this.selectedSeats = selectedSeats;
        this.totalPrice = totalPrice;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(Integer contactDetail) {
        this.contactDetail = contactDetail;
    }

    public Integer getCardDetail() {
        return cardDetail;
    }

    public void setCardDetail(Integer cardDetail) {
        this.cardDetail = cardDetail;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Integer getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(Integer cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public Integer getCardCode() {
        return cardCode;
    }

    public void setCardCode(Integer cardCode) {
        this.cardCode = cardCode;
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

    public Time getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(Time screeningTime) {
        this.screeningTime = screeningTime;
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
