package hw6;

public class BankAccount {
    private final String accountNumber;
    private MonetaryValue balance;

    public BankAccount(String accountNumber, MonetaryValue balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public MonetaryValue getBalance() {
        return balance;
    }

    public boolean deposit(MonetaryValue amount) {
        if (amount.isNegative()) {
            return false;
        } else {
            balance = balance.plus(amount);
            return true;
        }
    }

    public boolean withdraw(MonetaryValue amount) {
        if (withdrawalNotAllowed(amount)) {
            return false;
        } else {
            balance = balance.minus(amount);
            return true;
        }
    }

    public boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || balance.isLessThan(amount);
    }

    public String toString() {
        return accountNumber + " " + balance.toString();
    }
}
