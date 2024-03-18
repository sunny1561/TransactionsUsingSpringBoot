package com.Flight_service.Transactions_demo.service;

import com.Flight_service.Transactions_demo.Entity.Passenger_Info;
import com.Flight_service.Transactions_demo.Entity.Payment_Info;
import com.Flight_service.Transactions_demo.Repository.PassengerRepository;
import com.Flight_service.Transactions_demo.Repository.PaymentRepository;
import com.Flight_service.Transactions_demo.dto.Confirmation;
import com.Flight_service.Transactions_demo.dto.FlightBookingRequest;
import com.Flight_service.Transactions_demo.utils.Payment_utils;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.UUID;

@Service
public class ApiService {
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Transactional
    public Confirmation BookFlight(FlightBookingRequest request) throws IllegalAccessException {

        Passenger_Info passengerInfo=request.getPassengerInfo();
        Payment_Info  paymentInfo=request.getPaymentInfo();



        passengerInfo=passengerRepository.save(passengerInfo);

        Payment_utils.feasible(paymentInfo.getAccountNo(), Passenger_Info.getFare());
        System.out.println("this is after feasible method in apiservice");
        paymentInfo.setPaymentId(String.valueOf(passengerInfo.getPid()));
        paymentInfo.getAmount(Passenger_Info.getFare());
        paymentRepository.save(paymentInfo);

        return new Confirmation("Success", Passenger_Info.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);







    }



}
