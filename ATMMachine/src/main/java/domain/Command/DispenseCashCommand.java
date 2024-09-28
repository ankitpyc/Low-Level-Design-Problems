package domain.Command;

import domain.ATM;
import domain.User;

public class DispenseCashCommand implements Command {

    ATM atm;
    User user;
    int amount;

    public DispenseCashCommand(ATM atm, User user, int amount) {
        atm.dispenseMoney(amount);
    }

    @Override
    public void execute(User user) {

    }
}
