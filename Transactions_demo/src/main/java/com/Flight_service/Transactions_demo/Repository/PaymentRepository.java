package com.Flight_service.Transactions_demo.Repository;

import com.Flight_service.Transactions_demo.Entity.Payment_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment_Info,Long> {
}
