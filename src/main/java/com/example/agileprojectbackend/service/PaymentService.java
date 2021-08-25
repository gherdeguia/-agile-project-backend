package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Payment;
import com.example.agileprojectbackend.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService {
    @Resource
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
