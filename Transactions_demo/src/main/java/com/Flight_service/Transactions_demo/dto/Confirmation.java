package com.Flight_service.Transactions_demo.dto;

import com.Flight_service.Transactions_demo.Entity.Passenger_Info;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
public class Confirmation {
    private String status;
    private double TotalFare;
    private String pnrNo;
    private Passenger_Info passengerInfo;



    public Confirmation(String success, Double fare, String s, Passenger_Info passengerInfo) {
        System.out.println("This is Confirmation.java");


    }
}
