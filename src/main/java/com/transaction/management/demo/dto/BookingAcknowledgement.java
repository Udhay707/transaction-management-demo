package com.transaction.management.demo.dto;

import com.transaction.management.demo.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingAcknowledgement {
    private String status;
    private double totalFAre;
    private String pnr;
    private PassengerInfo passengerInfo;
}
