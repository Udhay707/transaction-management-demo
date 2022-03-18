package com.transaction.management.demo.repo;

import com.transaction.management.demo.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> {
}
