package hw6;

public class CheckingAccount extends BankAccount {
    private final MonetaryValue overdraftLimit;

    public CheckingAccount(String accountNumber, MonetaryValue balance, MonetaryValue overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public MonetaryValue getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || amount.isGreaterThan(getBalance().plus(overdraftLimit));
    }
}
