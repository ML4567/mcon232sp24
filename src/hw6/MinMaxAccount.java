package hw6;

public class MinMaxAccount extends BankAccount {
    private MonetaryValue min, max;

    public MinMaxAccount(String accountNumber, MonetaryValue balance) {
        super(accountNumber, balance);
        min = max = balance;
    }

    public MonetaryValue getMin() {
        return min;
    }

    public MonetaryValue getMax() {
        return max;
    }

    @Override
    public String toString() {
        return super.toString() + " [min=" + min + ", max=" + max + "]";
    }

    @Override
    public boolean deposit(MonetaryValue amount) {
        boolean result = super.deposit(amount);

        if (getBalance().isGreaterThan(max)) {
            max = getBalance();
        }

        return result;
    }

    @Override
    public boolean withdraw(MonetaryValue amount) {
        boolean result = super.withdraw(amount);

        if (getBalance().isLessThan(min)) {
            min = getBalance();
        }

        return result;
    }
}