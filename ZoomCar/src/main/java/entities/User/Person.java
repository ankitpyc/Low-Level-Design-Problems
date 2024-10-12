package entities.User;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private Integer userid;
    private String username;
    private String password;
    private String emailId;
    private String phoneNumber;
}
