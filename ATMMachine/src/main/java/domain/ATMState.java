package domain;

public abstract class ATMState {

    public User user;


    public ATMState(User user) {
        this.user = user;
    }


    public abstract void WithdrawCash(Integer amounr);

    public abstract void AuthenticateUser();

    public abstract void EnterAmount(Integer amount);

    public abstract void CheckBalance();

    public abstract void DepositCheque();

}
