package com.transaction.management.demo.utils;

import com.transaction.management.demo.dto.BookingRequest;
import com.transaction.management.demo.exception.InSufficientFund;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> cardDetails = new HashMap<>();

    static{
        cardDetails.put("card1",10000.0);
        cardDetails.put("card2",12000.0);
        cardDetails.put("card3",15000.0);
        cardDetails.put("card4",8000.0);
        cardDetails.put("card5",1000.0);
    }

    public static Boolean validateLimit(String accNo, double amount){
        if(cardDetails.get(accNo) < amount){
            throw new InSufficientFund("Insufficient Fund..");
        }
        else{
            return true;
        }
    }

}
