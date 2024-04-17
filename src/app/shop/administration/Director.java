package app.shop.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private AccountantChief accountantChief;
    @Autowired
    private TradeChief tradeChief;

    public AccountantChief getAccountantChief() {
        return accountantChief;
    }

    public void setAccountantChief(AccountantChief accountantChief) {
        this.accountantChief = accountantChief;
    }

    public TradeChief getTradeChief() {
        return tradeChief;
    }

    public void setTradeChief(TradeChief tradeChief) {
        this.tradeChief = tradeChief;
    }

    public void manageShop() {
        accountantChief.giveOrders();
        tradeChief.giveOrders();
    }
}
