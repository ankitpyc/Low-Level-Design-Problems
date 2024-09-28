package domain.Command;

import domain.BalanceService;
import domain.User;

public class BalanceCommand implements Command {

    User user;
    BalanceService balanceService;

    public BalanceCommand(User user) {
        this.user = user;
        balanceService = new BalanceService();
    }

    @Override
    public void execute(User user) {
        balanceService.getBalance(user);

    }
}
