package domain.service;

import domain.*;
import domain.SplitStrategy.ExpenseSplitStrategy;

import java.util.Map;

public class ExpenseService implements ExpensePublisher {

    public boolean splitExpense(Expense expense) {
        ExpenseSplitStrategy splitStrategy = expense.getSplitStrategy();
        Map<User, Double> splitMap = splitStrategy.split(expense);
        for (Map.Entry entry : splitMap.entrySet()) {
            User user = (User) entry.getKey();
            Double amount = (Double) entry.getValue();
            if (expense.getPaidBy().equals(user)) {
                ExpenseEvent expenseEvent = new ExpenseEvent(ExpenseOperation.CREDIT);
                expenseEvent.setAmount(amount);
                user.getBalanceSheet().observe(expenseEvent);
            } else {
                ExpenseEvent expenseEvent = new ExpenseEvent(ExpenseOperation.DEBIT);
                expenseEvent.setAmount(amount);
                user.getBalanceSheet().observe(expenseEvent);
            }
        }
        return true;
    }

    @Override
    public void onExpenseAddition() {

    }
}
