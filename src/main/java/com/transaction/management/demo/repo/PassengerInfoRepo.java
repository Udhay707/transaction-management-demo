package com.transaction.management.demo.repo;

import com.transaction.management.demo.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {
}
