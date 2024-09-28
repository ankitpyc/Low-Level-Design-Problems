package domain.AtmStates;

import domain.ATMState;
import domain.Transaction;
import domain.User;
import domain.enums.ATMOperation;

public class Withdraw extends ATMState {

    Transaction transaction;

    public Withdraw(User user, Transaction transaction) {
        super(user);
        this.transaction = transaction;
    }

    @Override
    public void WithdrawCash(Integer amount) {
        if (user.getIsAuthenticate()) {
            if (user.getBalance() < amount) {
                System.out.println("Insufficient Balance");
                transaction.setAtmState(domain.enums.ATMState.ENTER_AMOUNT);
            } else {
                transaction.setAtmState(domain.enums.ATMState.DISPENSING_CASH);
            }
        } else {
            transaction.setAtmState(domain.enums.ATMState.ENTER_CARD);
        }
    }

    @Override
    public void AuthenticateUser() {
        if (user.getIsAuthenticate()) {
            System.out.println("User is Already Authenticated");
        } else {
            System.out.println("User is Unauthenticated , Please Authorize again");
            transaction.setAtmState(domain.enums.ATMState.ENTER_CARD);
        }
    }

    @Override
    public void EnterAmount(Integer amount) {
        System.out.println("Please Cancel Txn to choose a differrent amount to be withdrawn");
    }

    @Override
    public void CheckBalance() {

    }

    @Override
    public void DepositCheque() {
        if (transaction.getOperation() != ATMOperation.DEPOSIT_CHEQUE) {
            System.out.println("Please Initiate a different transaction");
            return;
        }
    }
}
