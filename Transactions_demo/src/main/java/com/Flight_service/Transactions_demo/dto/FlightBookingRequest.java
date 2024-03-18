package com.Flight_service.Transactions_demo.dto;

import com.Flight_service.Transactions_demo.Entity.Passenger_Info;
import com.Flight_service.Transactions_demo.Entity.Payment_Info;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class FlightBookingRequest {
    private Payment_Info paymentInfo;

    public FlightBookingRequest() {
        System.out.println("This is FlightBookingRequest.java class");
    }

    public Payment_Info getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(Payment_Info paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Passenger_Info getPassengerInfo() {
        System.out.println("This is getPasseneger.info");
        return passengerInfo;

    }

    public void setPassengerInfo(Passenger_Info passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    private Passenger_Info passengerInfo;



}
