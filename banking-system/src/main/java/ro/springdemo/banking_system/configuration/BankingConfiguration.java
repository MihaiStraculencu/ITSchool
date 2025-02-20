package ro.springdemo.banking_system.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.springdemo.banking_system.service.BankingService;

@Configuration
public class BankingConfiguration {

    @Bean
    public BankingService bankingService() {
        System.out.println("banking service created");
        return new BankingService();
    }
}