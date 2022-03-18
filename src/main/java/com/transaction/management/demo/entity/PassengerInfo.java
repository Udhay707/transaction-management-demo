package com.transaction.management.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pId;
    private String name;
    private String email;
    private String source;
    private String destination;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;

}
