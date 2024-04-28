package hw5;

public class BankAccount {
    private final int accountNumber;
    private final AccountHolder accountHolder;
    private MonetaryValue balance;

    private static int nextAccountNumber = 0;

    public BankAccount(int accountNumber, AccountHolder accountHolder, MonetaryValue balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = new AccountHolder(accountHolder);
        this.balance = balance;
    }

    public BankAccount(AccountHolder accountHolder) {
        this(nextAccountNumber++, accountHolder, MonetaryValue.ZERO);
    }

    public BankAccount(BankAccount original) {
        this.accountNumber = original.accountNumber;
        this.accountHolder = new AccountHolder(original.accountHolder);
        this.balance = original.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountHolder getAccountHolder() {
        return new AccountHolder(accountHolder);
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
        if (amount.isNegative() || amount.isGreaterThan(balance)) {
            return false;
        } else {
            balance = balance.minus(amount);
            return true;
        }
    }

    public String toString() {
        return accountNumber + " " + accountHolder + " " + balance;
    }
}
