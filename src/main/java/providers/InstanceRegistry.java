package providers;

import java.util.HashMap;
import java.util.Map;

public class InstanceRegistry {

    private static final Map<String, Provider> instances = new HashMap<>();

    public static void register(String nameInstance, Provider instance) {
        System.out.println("InstanceRegistry: register");
        instances.put(nameInstance, instance);
    }

    public static Provider getProvider(String providerType) {
        new Mailchimp();
        new Sendgird();
        new Sendinblue();
        new SendSms();
        return instances.get(providerType);
    }
}
