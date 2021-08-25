package com.example.agileprojectbackend.dto;

import java.sql.Time;
import java.util.Date;

public class PaymentRequest {

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
    private Time screeningStartTime;
    private Time screeningEndTime;
    private String selectedSeats;
    private Double totalPrice;

    public PaymentRequest() {
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
