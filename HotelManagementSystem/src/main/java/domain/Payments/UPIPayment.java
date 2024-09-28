package domain.Payments;

import domain.Bookings;

public class UPIPayment implements PaymentStrategy {
    @Override
    public boolean makePayment(Bookings bookings) {
        return false;
    }
}
