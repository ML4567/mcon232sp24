package hw5;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account = new BankAccount(
                123,
                new AccountHolder(new Name("John", "Doe"), new PhoneNumber("123-456-7890"), "12345678", "john@example.com"),
                MonetaryValue.ZERO);
        bank.addAccount(account);
        account.deposit(MonetaryValue.ofDollars(100)); // this should have no effect on the Bank. The only way to deposit money in an account that's in a bank is through the bank.
        bank.deposit(123, MonetaryValue.ofDollars(100)); // this should work
    }
}
