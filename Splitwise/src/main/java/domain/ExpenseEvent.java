package domain;

import java.util.List;
import java.util.Map;

public class ExpenseEvent {
    ExpenseOperation expenseOperation;
    Map<User,Double> splitMap;

    public ExpenseEvent(ExpenseOperation expenseOperation) {
        this.expenseOperation = expenseOperation;
    }

    public ExpenseOperation getExpenseOperation() {
        return expenseOperation;
    }

    public void setExpenseOperation(ExpenseOperation expenseOperation) {
        this.expenseOperation = expenseOperation;
    }

    public Map<User, Double> getSplitMap() {
        return splitMap;
    }

    public void setSplitMap(Map<User, Double> splitMap) {
        this.splitMap = splitMap;
    }
}
