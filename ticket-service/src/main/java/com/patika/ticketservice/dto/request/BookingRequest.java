package com.patika.ticketservice.dto.request;

import com.patika.ticketservice.model.enums.TravelType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingRequest {

    private Long bookingUserId;

    private String bookingUserEmail;

    private List<TicketRequest> bookingTicketRequestList;

    private String bookingOriginCity;

    private String bookingDestinationCity;

    private String bookingVoyageDateTime;

    private TravelType bookingTravelType;

}
