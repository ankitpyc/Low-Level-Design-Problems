package domain;

import java.util.List;
import java.util.Map;

public class ExpenseEvent {
    ExpenseOperation expenseOperation;
    Double amount;
    User user;

    public ExpenseEvent(ExpenseOperation expenseOperation) {
        this.expenseOperation = expenseOperation;
    }

    public ExpenseOperation getExpenseOperation() {
        return expenseOperation;
    }

    public void setExpenseOperation(ExpenseOperation expenseOperation) {
        this.expenseOperation = expenseOperation;
    }

    public Double getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
