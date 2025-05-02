package com.credit.crefitmanagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CreditService creditService = context.getBean("creditService", CreditService.class);
        creditService.afiseazaDetalii();
    }
}
