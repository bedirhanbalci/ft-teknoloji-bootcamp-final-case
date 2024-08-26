package com.patika.ticketservice.client.payment.service.dto.request;

import com.patika.ticketservice.client.payment.service.dto.response.enums.PaymentType;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentRequest {

    private Long bookingId;
    private BigDecimal amount;
    private PaymentType paymentType;

}
