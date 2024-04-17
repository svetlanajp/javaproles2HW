package app.code;

import app.shop.administration.AccountantChief;
import app.shop.administration.Director;
import app.shop.administration.TradeChief;
import app.shop.specialists.accountingDepartment.Accountant;
import app.shop.specialists.tradeDepartment.Cashier;
import app.shop.specialists.tradeDepartment.Salesman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

    public static void main(String[] args) {
        //Первый вариант без использования Spring
//        Cashier cashier = new Cashier();
//        Salesman salesman = new Salesman();
//        Accountant accountant = new Accountant();
//
//        TradeChief tradeChief = new TradeChief();
//        tradeChief.setCashier(cashier);
//        tradeChief.setSalesman(salesman);
//
//        AccountantChief accountantChief=new AccountantChief();
//        accountantChief.setAccountant(accountant);
//
//        Director director=new Director();
//        director.setTradeChief(tradeChief);
//        director.setAccountantChief(accountantChief);
//
//        director.manageShop();

        //Второй вариант с использванием Spring
        AbstractApplicationContext context=new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manageShop();

    }
}