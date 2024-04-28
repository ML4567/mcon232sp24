package hw5;

public class Bank {
    private BankAccount[] accounts;
    private int numAccounts;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        numAccounts = 0;
    }

    public Bank() {
        this(10);
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public boolean addAccount(BankAccount account) {
        if (isFull() || containsAccountNumber(account.getAccountNumber())) {
            return false;
        } else {
            accounts[numAccounts] = new BankAccount(account); // defensive copy
            numAccounts++;
            return true;
        }
    }

    public boolean containsAccountNumber(int accountNumber) {
        return indexOfAccount(accountNumber) != -1;
    }

    public boolean isFull() {
        return numAccounts == accounts.length;
    }

    public MonetaryValue getBalance(int accountNumber) {
        int index = indexOfAccount(accountNumber);

        if (index != -1) {
            return accounts[index].getBalance();
        } else {
            return null;
        }
    }

    public boolean deposit(int accountNumber, MonetaryValue amount) {
        int index = indexOfAccount(accountNumber);

        if (index != -1) {
            return accounts[index].deposit(amount);
        } else {
            return false;
        }
    }

    public boolean withdraw(int accountNumber, MonetaryValue amount) {
        int index = indexOfAccount(accountNumber);

        if (index != -1) {
            return accounts[index].withdraw(amount);
        } else {
            return false;
        }
    }

    public BankAccount getAccountWithHighestBalance() {
        BankAccount accountWithHighestBalance = accounts[0];

        for (int i = 1; i < numAccounts; i++) {
            if (accounts[i].getBalance().isGreaterThan(accountWithHighestBalance.getBalance())) {
                accountWithHighestBalance = accounts[i];
            }
        }

        return new BankAccount(accountWithHighestBalance); // defensive copy
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numAccounts; i++) {
            sb.append(accounts[i]);
            sb.append("\n");
        }

        return sb.toString();
    }

    private int indexOfAccount(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }

        return -1;
    }
}
