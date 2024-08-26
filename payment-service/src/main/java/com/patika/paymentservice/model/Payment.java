package com.patika.paymentservice.model;

import com.patika.paymentservice.model.enums.PaymentType;
import com.patika.paymentservice.model.enums.PaymentStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "payments")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookingId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "createdDateTime")
    private LocalDateTime createdDateTime;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    public Payment(Long bookingId, BigDecimal amount, PaymentType paymentType, LocalDateTime createdDateTime, PaymentStatus paymentStatus) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentType = paymentType;
        this.createdDateTime = createdDateTime;
        this.paymentStatus = paymentStatus;
    }

}
