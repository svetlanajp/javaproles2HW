package app.shop.administration;

import app.shop.specialists.tradeDepartment.Cashier;
import app.shop.specialists.tradeDepartment.Salesman;
import org.springframework.beans.factory.annotation.Autowired;

public class TradeChief {
    @Autowired
    private Cashier cashier;
    @Autowired
    private Salesman salesman;

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public void giveOrders() {
        cashier.count();
        salesman.consult();
    }
}
