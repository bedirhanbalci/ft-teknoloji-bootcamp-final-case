package com.patika.ticketservice.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingResponse {

    private Long id;

    private String passengerTelephoneNumber;

    private List<TicketResponse> ticketResponseList;

    private LocalDateTime creationDateTime;

    private BigDecimal bookingTotalPrice;

}
