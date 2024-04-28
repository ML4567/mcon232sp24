package hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboardScanner = new Scanner(System.in);
        Bank bank = new Bank(100);
        readAccounts(bank);

        String choice;
        do {
            System.out.println("L - lookup balance, D - deposit, W - withdraw, A - add account, Q - quit");
            choice = keyboardScanner.next();

            switch (choice) {
                case "L":
                    processLookup(bank, keyboardScanner);
                    break;

                case "D":
                    processDeposit(bank, keyboardScanner);
                    break;

                case "W":
                    processWithdrawal(bank, keyboardScanner);
                    break;

                case "A":
                    processAdd(bank, keyboardScanner);
                    break;

            }
        } while (!choice.equals("Q"));

        PrintStream printStream = new PrintStream("updated_accounts.txt");
        printStream.print(bank);
        printStream.close();
    }

    private static void readAccounts(Bank bank) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("initial_accounts.txt"));

        while (fileScanner.hasNextLine()) {
            BankAccount account = getAccount(fileScanner);
            bank.addAccount(account);
        }
    }

    private static BankAccount getAccount(Scanner fileScanner) {
        String line = fileScanner.nextLine();
        Scanner lineScanner = new Scanner(line);
        int accountNumber = lineScanner.nextInt();
        String firstName = lineScanner.next();
        String lastName = lineScanner.next();
        Name name = new Name(firstName, lastName);
        PhoneNumber phoneNumber = new PhoneNumber(lineScanner.next());
        String ssn = lineScanner.next();
        String emailAddress = lineScanner.next();
        AccountHolder accountHolder = new AccountHolder(name, phoneNumber, ssn, emailAddress);
        MonetaryValue balance = MonetaryValue.parse(lineScanner.next());
        return new BankAccount(accountNumber, accountHolder, balance);
    }

    private static void processLookup(Bank bank, Scanner keyboardScanner) {
        System.out.print("account number: ");
        int accountNumber = keyboardScanner.nextInt();
        MonetaryValue result = bank.getBalance(accountNumber);

        if (result == null) {
            System.out.println("Account number not found");
        } else {
            System.out.println("The balance is: " + result);
        }
    }

    private static void processDeposit(Bank bank, Scanner keyboardScanner) {
        System.out.print("account number: ");
        int accountNumber = keyboardScanner.nextInt();
        System.out.print("amount to deposit: ");
        MonetaryValue amount = MonetaryValue.parse(keyboardScanner.next());
        boolean depositedSuccessfully = bank.deposit(accountNumber, amount);

        if (depositedSuccessfully) {
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Deposit unsuccessful");
        }
    }

    private static void processWithdrawal(Bank bank, Scanner keyboardScanner) {
        System.out.print("account number: ");
        int accountNumber = keyboardScanner.nextInt();
        System.out.print("amount to withdraw: ");
        MonetaryValue amount = MonetaryValue.parse(keyboardScanner.next());
        boolean withdrewSuccessfully = bank.deposit(accountNumber, amount);

        if (withdrewSuccessfully) {
            System.out.println("Successfully withdrew " + amount);
        } else {
            System.out.println("Withdrawal unsuccessful");
        }
    }

    private static void processAdd(Bank bank, Scanner keyboardScanner) {
        System.out.print("first name: ");
        String firstName = keyboardScanner.next();
        System.out.print("last name: ");
        String lastName = keyboardScanner.next();
        Name name = new Name(firstName, lastName);
        System.out.print("phone number: ");
        PhoneNumber phoneNumber = new PhoneNumber(keyboardScanner.next());
        System.out.print("ssn: ");
        String ssn = keyboardScanner.next();
        System.out.println("email address: ");
        String emailAddress = keyboardScanner.next();
        AccountHolder accountHolder = new AccountHolder(name, phoneNumber, ssn, emailAddress);
        BankAccount account = new BankAccount(accountHolder);
        boolean addedSuccessfully = bank.addAccount(account);

        if (addedSuccessfully) {
            System.out.println("Successfully added " + account);
        } else {
            System.out.println("Adding account unsuccessful");
        }
    }
}
