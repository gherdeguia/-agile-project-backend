package com.example.agileprojectbackend.model;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seat_id")
    private Integer seat_id;
    private String seat_num;
    private boolean is_available = false;

    private Integer screening_id;
//    private Integer payment_id;

    public Seat() {
    }

    public Seat(Integer seat_id, String seat_num, boolean is_available, Integer screening_id) {
        this.seat_id = seat_id;
        this.seat_num = seat_num;
        this.is_available = is_available;
        this.screening_id = screening_id;
    }

    public Seat(Integer seat_id, String seat_num, boolean is_available) {
        this.seat_id = seat_id;
        this.seat_num = seat_num;
        this.is_available = is_available;
    }


    public Integer getId() {
        return seat_id;
    }

    public void setId(Integer id) {
        this.seat_id = id;
    }

    public String getSeatNumber() {
        return seat_num;
    }

    public void setSeatNumber(String seatNumber) {
        this.seat_num = seatNumber;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

    public Integer getScreening_id() {
        return screening_id;
    }

    public void setScreening_id(Integer screening_id) {
        this.screening_id = screening_id;
    }


//    public Integer getPayment_id() {
//        return payment_id;
//    }
//
//    public void setPayment_id(Integer payment_id) {
//        this.payment_id = payment_id;
//    }
}
