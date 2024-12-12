package com.example.demo;

import factories.ProviderFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import providers.Provider;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String type = "mailchimp";
        String email = "nguyenhunglam182001@gmail.com";
        String message = "Gửi mailchimp nè";

        try {
            Provider provider = ProviderFactory.getProvider(type);
            provider.send(email, message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
