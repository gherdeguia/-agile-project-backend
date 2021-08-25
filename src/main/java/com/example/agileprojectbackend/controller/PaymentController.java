package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.dto.PaymentRequest;
import com.example.agileprojectbackend.dto.PaymentResponse;
import com.example.agileprojectbackend.mapper.PaymentMapper;
import com.example.agileprojectbackend.model.Payment;
import com.example.agileprojectbackend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @Autowired
    PaymentMapper paymentMapper;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PaymentResponse addPayment(@RequestBody PaymentRequest paymentRequest) {
        Payment payment = paymentService.addPayment(paymentMapper.toEntity(paymentRequest));
        return paymentMapper.toResponse(payment);
    }
}
