package com.patika.paymentservice.dto.request;

import com.patika.paymentservice.model.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

    private Long bookingId;

    private BigDecimal amount;

    private PaymentType paymentType;

}
