package com.transaction.management.demo.service;

import com.transaction.management.demo.dto.BookingAcknowledgement;
import com.transaction.management.demo.dto.BookingRequest;
import com.transaction.management.demo.entity.PassengerInfo;
import com.transaction.management.demo.entity.PaymentInfo;
import com.transaction.management.demo.repo.PassengerInfoRepo;
import com.transaction.management.demo.repo.PaymentInfoRepo;
import com.transaction.management.demo.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepo passengerInfoRepo;

    @Autowired
    private PaymentInfoRepo paymentInfoRepo;


    public BookingAcknowledgement flightBookingService(BookingRequest request){
    	
    	String name = "Udhay";
        PassengerInfo info = request.getPassengerInfo();
        passengerInfoRepo.save(info);
        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateLimit(paymentInfo.getAccountNo(), info.getFare());
        paymentInfo.setPassengerId(info.getPId());
        paymentInfo.setAmount(info.getFare());
        paymentInfoRepo.save(paymentInfo);
        return new BookingAcknowledgement("SUCCESS", info.getFare(), UUID.randomUUID().toString().split("-")[0],info);
    }
}
