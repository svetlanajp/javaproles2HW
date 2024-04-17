package app.config;

import app.shop.administration.AccountantChief;
import app.shop.administration.Director;
import app.shop.administration.TradeChief;
import app.shop.specialists.accountingDepartment.Accountant;
import app.shop.specialists.tradeDepartment.Cashier;
import app.shop.specialists.tradeDepartment.Salesman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    public AccountantChief accountantChief() {
        return new AccountantChief();
    }

    @Bean
    public TradeChief tradeChief() {
        return new TradeChief();
    }

    @Bean
    public Accountant accountant() {
        return new Accountant();
    }

    @Bean
    public Cashier cashier() {
        return new Cashier();
    }

    @Bean
    public Salesman salesman() {
        return new Salesman();
    }

}
