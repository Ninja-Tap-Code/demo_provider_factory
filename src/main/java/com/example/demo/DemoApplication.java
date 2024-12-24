package com.example.demo;

import factories.ProviderFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import providers.Provider;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String type = "SendSms";
        String email = "nguyenhunglam182001@gmail.com";
        String message = "Gửi SendSms nè";

        try {
            Provider provider = ProviderFactory.getProvider(type.toLowerCase());
            provider.send(email, message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("[TEST CHANGE GIT GLOBAL]");
        }
    }
}
