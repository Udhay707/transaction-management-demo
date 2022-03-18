package com.transaction.management.demo.exception;

public class InSufficientFund extends RuntimeException{

    public InSufficientFund(String message){
        super(message);
    }
}
