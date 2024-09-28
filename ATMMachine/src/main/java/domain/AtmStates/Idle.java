package domain.AtmStates;

import domain.ATMState;
import domain.Command.Command;
import domain.Command.ValidateUserCommand;
import domain.User;

public class Idle extends ATMState {

    User user;

    Command command;

    public Idle(User user) {
        super(user);
        command = new ValidateUserCommand();
    }

    @Override
    protected void WithdrawCash(Integer amounr) {
        System.out.println("Invalid Operation - Enter Card First and validate");
    }

    @Override
    protected void AuthenticateUser() {
        System.out.println("Validating User .. ");
        command.execute(user);
    }

    @Override
    protected void EnterAmount(Integer amount) {
        System.out.println("Invalid Operation - Enter Card First and validate");

    }

    @Override
    public void CheckBalance() {
        System.out.println("Invalid Operation - Enter Card First and validate");

    }

    @Override
    public void DepositCheque() {
        System.out.println("Invalid Operation - Enter Card First and validate");

    }
}
