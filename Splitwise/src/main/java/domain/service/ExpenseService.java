package domain.service;

import domain.*;
import domain.SplitStrategy.ExpenseSplitStrategy;
import java.util.Map;

public class ExpenseService implements ExpensePublisher {

    public boolean splitExpense(Expense expense) {
        ExpenseSplitStrategy splitStrategy = expense.getSplitStrategy();
        Map<User, Double> splitMap = splitStrategy.split(expense);
        for (User user : expense.getParticipantList()) {
            if (expense.getPaidBy().equals(user)) {
                ExpenseEvent expenseEvent = new ExpenseEvent(ExpenseOperation.CREDIT);
                expenseEvent.setSplitMap(splitMap);
                user.getBalanceSheet().observe(expenseEvent);
            } else {
                ExpenseEvent expenseEvent = new ExpenseEvent(ExpenseOperation.DEBIT);
                expenseEvent.setSplitMap(splitMap);
                user.getBalanceSheet().observe(expenseEvent);
            }
        }
        return true;
    }

    @Override
    public void onExpenseAddition() {

    }
}
