package com.example.agileprojectbackend.dto;


public class UserRequest {
    private Integer id;
    private String emailAddress;
    private String fullName;
    private String password;
    private String phoneNumber;

    public UserRequest() {
    }

    public UserRequest(Integer id, String emailAddress, String fullName, String password, String phoneNumber) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.fullName = fullName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
