package com.Flight_service.Transactions_demo.Repository;

import com.Flight_service.Transactions_demo.Entity.Passenger_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger_Info,Long> {
}
