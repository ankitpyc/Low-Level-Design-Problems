package domain.AtmStates;

import domain.ATMState;
import domain.Command.ValidateUserCommand;
import domain.User;

import java.util.Scanner;

public class ValidateUser extends ATMState {

    User user;

    ValidateUserCommand validateUserCommand;

    public ValidateUser(User user) {
        super(user);
        validateUserCommand = new ValidateUserCommand();
    }

    @Override
    public void WithdrawCash(Integer amount) {
        System.out.println("User need to be authenticated first");
    }

    @Override
    public void AuthenticateUser() {

    }

    @Override
    public void EnterAmount(Integer amount) {
        System.out.println("Enter the amount in multiples of 100s");
        Scanner scanner = new Scanner(System.in);
        Integer withdrawAmount = scanner.nextInt();
        user.setWithdrawAmount(withdrawAmount);
        user.getTransaction().setAtmState(domain.enums.ATMState.DISPENSING_CASH);
    }

    @Override
    public void CheckBalance() {
        System.out.println("User need to be authenticated first");

    }

    @Override
    public void DepositCheque() {
        System.out.println("Invalid Operation this is card withdrawal txn");

    }
}
