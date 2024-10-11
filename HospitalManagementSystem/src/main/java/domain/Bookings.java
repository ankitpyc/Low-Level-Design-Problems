package domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bookings {
    private String bookingId;
    private Date bookingStartTime;
    private Date getBookingEndTime;
    private Doctor doctor;
    private BookingStatus status;
    private String problemBrief;
    private Double fees;
    private PaymentStatus paymentStatus;
}
