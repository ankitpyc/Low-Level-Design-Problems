package domain;

import domain.SplitStrategy.ExpenseSplitStrategy;

import java.util.List;

public class Expense {
    private int expenseId;
    private ExpenseType expenseType;
    List<User> participantList;
    private ExpenseSplitStrategy splitStrategy;
    Double expenseAmount;
    User paidBy;
    Boolean isGroupExpense;
    Group group;

    public Expense(int expenseId) {
        this.expenseId = expenseId;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public List<User> getParticipantList() {
        return participantList;
    }

    public ExpenseSplitStrategy getSplitStrategy() {
        return splitStrategy;
    }

    public void setSplitStrategy(ExpenseSplitStrategy splitStrategy) {
        this.splitStrategy = splitStrategy;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public void setParticipantList(List<User> participantList) {
        this.participantList = participantList;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public Boolean getGroupExpense() {
        return isGroupExpense;
    }

    public void setGroupExpense(Boolean groupExpense) {
        isGroupExpense = groupExpense;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
