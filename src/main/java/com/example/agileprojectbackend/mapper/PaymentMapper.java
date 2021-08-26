package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.PaymentRequest;
import com.example.agileprojectbackend.dto.PaymentResponse;
import com.example.agileprojectbackend.model.Payment;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class PaymentMapper {
    public Payment toEntity(PaymentRequest paymentRequest) {
        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentRequest, payment);
        return payment;
    }
    public PaymentResponse toResponse(Payment payment){
        PaymentResponse paymentResponse = new PaymentResponse();
        BeanUtils.copyProperties(payment, paymentResponse);
        paymentResponse.setTicketNumber(generateTicket(payment));
        return paymentResponse;
    }

    private String generateTicket(Payment payment) {
        Date dateNow = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = dateFormatter.format(dateNow);
        String ticketNumber = datetime+payment.getId();
        return ticketNumber;
    }

}
