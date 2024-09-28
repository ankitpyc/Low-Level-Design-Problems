import domain.ATMState;
import domain.AtmStates.Idle;
import domain.User;

public class ATMMachine {

    User user;
    ATMState currstate;

    public ATMMachine() {
        user = new User();
        user.setName("Ankit Mishra");
        user.setAccountNumber("122323144");
        currstate = new Idle(user);
    }

    public void insertCard() {
        currstate.AuthenticateUser();
    }

    public static void main(String[] args) {

    }

}
