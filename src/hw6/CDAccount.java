package hw6;

import java.time.LocalDate;
import java.time.Period;

public class CDAccount extends BankAccount {
    private final LocalDate startDate;
    private final Period termInMonths;

    public CDAccount(String accountNumber, MonetaryValue balance, LocalDate startDate, Period termInMonths) {
        super(accountNumber, balance);
        this.startDate = startDate;
        this.termInMonths = termInMonths;
    }

    public LocalDate getTermEnd() {
        return startDate.plus(termInMonths);
    }

    @Override
    public boolean withdrawalNotAllowed(MonetaryValue amount) {
        return super.withdrawalNotAllowed(amount) || LocalDate.now().isBefore(getTermEnd());
    }
}
