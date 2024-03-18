package com.Flight_service.Transactions_demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name ="payment_Info")
public class Payment_Info {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;
    private String accountNo;

    private double amount;

    public Payment_Info() {
        System.out.println("thi is payment_info class");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String cardType;

    private Long passengerId
            ;

    public String getAccountNo() {
        return accountNo;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }




    public void getAmount(Double fare) {
    }
}
