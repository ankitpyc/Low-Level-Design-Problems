package domain.SplitStrategy;

import domain.Expense;
import domain.User;

import java.util.Map;

public interface ExpenseSplitStrategy {

    Map<User,Double> split(Expense expense);
}
