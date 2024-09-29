package domain;

import domain.Humans.Guest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentInvoice {
    Date paymentDoneAt;
    Guest guest;
    PaymentStatus paymentStatus;
}
