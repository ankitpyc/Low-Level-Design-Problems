package domain.BalanceSheet;

import domain.*;

import java.util.Map;

public class BalanceSheet  implements ExpenseObserver {
    Map<User,Double> balanceSheet;
    Double totalCreditAmount;
    Double totalDebitAmount;

    public BalanceSheet(Map<User, Double> balanceSheet, Double totalCreditAmount, Double totalDebitAmount) {
        this.balanceSheet = balanceSheet;
        this.totalCreditAmount = totalCreditAmount;
        this.totalDebitAmount = totalDebitAmount;
    }

    public Map<User, Double> getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(Map<User, Double> balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public Double getTotalCreditAmount() {
        return totalCreditAmount;
    }

    public void setTotalCreditAmount(Double totalCreditAmount) {
        this.totalCreditAmount = totalCreditAmount;
    }

    public Double getTotalDebitAmount() {
        return totalDebitAmount;
    }

    public void setTotalDebitAmount(Double totalDebitAmount) {
        this.totalDebitAmount = totalDebitAmount;
    }

    @Override
    public void observe(ExpenseEvent event) {
        if (event.getExpenseOperation().equals(ExpenseOperation.DEBIT)){
//            balanceSheet.get()
        }
    }
}
