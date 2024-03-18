package com.Flight_service.Transactions_demo.utils;

import java.util.HashMap;
import java.util.Map;

public class Payment_utils {
    private static final Map<String,Double>paymentMap = new HashMap<>();
    static {
         paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2",1000.0);
        paymentMap.put("acc3",9000.0);
    }
    public static boolean feasible(String acNo,double amountToPay) throws IllegalAccessException {
        System.out.println("this is feasible method in paymentutils class");
        if (amountToPay>paymentMap.get(acNo)) {
            throw  new IllegalAccessException("Insufficient Balance....!");

        }
        System.out.println("This is outside from the feasible method");
        return true;


    }


}
