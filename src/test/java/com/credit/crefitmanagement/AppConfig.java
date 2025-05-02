package com.credit.crefitmanagement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public Client client(){
        return new Client(1, "Petrasco Bogdan", "redan200@gmail.com","Mircea cel Batrin 17",373911911,21);
    }
    @Bean
    public Credit credit(){
        return new Credit(1,"Petrasco Bogdan",10000,13,36,true);
    }
    @Bean
    public Plata plata(){
        return new Plata(1,1,5000,"30.03.2004","Transfer MIA",false,0);
    }

    @Bean
    public CreditService creditService(){
        CreditService service = new CreditService();
        service.setClient(client());
        service.setCredit(credit());
        service.setPlata(plata());
        return service;

    }
}
