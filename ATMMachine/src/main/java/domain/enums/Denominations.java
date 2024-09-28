package domain.enums;

public enum Denominations {
    TWO_000(2000), One_000(100), One_00(100);

    final int amount;

    Denominations(int amount) {
        this.amount = amount;
    }


}
