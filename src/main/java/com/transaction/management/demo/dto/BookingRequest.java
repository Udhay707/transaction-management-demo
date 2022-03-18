package com.transaction.management.demo.dto;

import com.transaction.management.demo.entity.PassengerInfo;
import com.transaction.management.demo.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {

    private PaymentInfo paymentInfo;

    private PassengerInfo passengerInfo;
}
