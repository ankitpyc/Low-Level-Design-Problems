package domain.Payments;

import domain.Bookings;

public interface PaymentStrategy {

    public boolean makePayment(Bookings bookings);


}
