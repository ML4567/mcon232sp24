package hw6;

public class BonusAccount extends BankAccount {
    private final MonetaryValue bonus;

    public BonusAccount(String accountNumber, MonetaryValue balance, MonetaryValue bonus) {
        super(accountNumber, balance);
        this.bonus = bonus;
    }

    @Override
    public boolean deposit(MonetaryValue amount) {
        boolean result = super.deposit(amount);

        if (amount.isGreaterThan(MonetaryValue.ofDollars(100))) {
            super.deposit(bonus);
        }

        return result;
    }
}
