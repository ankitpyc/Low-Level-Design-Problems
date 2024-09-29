package domain.SplitStrategy;

import domain.Expense;
import domain.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EqualSplitStrategy implements ExpenseSplitStrategy {
    @Override
    public Map<User, Double> split(Expense expense) {
        Map<User, Double> splitMap = new HashMap<>();
        if (!expense.getGroupExpense()) {
            Double splitAmount = expense.getExpenseAmount() / (double) expense.getParticipantList().size();
            for (User user : expense.getParticipantList()) {
                splitMap.put(user, splitAmount);
            }
        }
        return splitMap;
    }
}
