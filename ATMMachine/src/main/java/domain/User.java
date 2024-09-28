package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    String name;
    String accountNumber;
    Boolean isAuthenticate;
    Double balance;
    Integer withdrawAmount;
    Transaction transaction;
}
