package domain;

public interface ExpenseObserver {

    public void observe(ExpenseEvent event);
}
