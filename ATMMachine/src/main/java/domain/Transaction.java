package domain;

import domain.enums.ATMOperation;
import domain.enums.ATMState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Transaction {
    ATMState atmState;
    ATMOperation operation;
}
