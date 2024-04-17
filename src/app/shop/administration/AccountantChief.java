package app.shop.administration;

import app.shop.specialists.accountingDepartment.Accountant;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountantChief {
    @Autowired
    private Accountant accountant;

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public void giveOrders() {
        accountant.keepCount();
    }
}
