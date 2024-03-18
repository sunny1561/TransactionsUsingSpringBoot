package com.Flight_service.Transactions_demo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data

@Entity
@Table(name ="Passenger_Info")
public class Passenger_Info {
    @Id
    @GeneratedValue
    private Long Pid;
    private String passenger_name;
    private String email;
    private String Destination;
    private String Source;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd-MM-YYYY")
    private Date travel_date;
    private String PickUpTime;
    private String ArrivalTime;
    private static Double fare;

    public Passenger_Info() {
        System.out.println("THIS is Passenger_Info.java class constructor");
    }


    public static Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        Passenger_Info.fare = fare;
    }

    public Long getPid() {
        return Pid;
    }

    public void setPid(Long pid) {
        Pid = pid;
    }
}
