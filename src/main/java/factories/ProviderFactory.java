package factories;

import providers.Sendinblue;
import providers.Provider;
import providers.Mailchimp;
import providers.Sendgird;

import java.util.HashMap;
import java.util.Map;

public class ProviderFactory {

    private static final Map<String, Provider> providers = new HashMap<>();

    static {
        providers.put("sendinblue", new Sendinblue());
        providers.put("sendgird", new Sendgird());
        providers.put("mailchimp", new Mailchimp());
    }

    public static Provider getProvider(String providerType) {
        Provider provider = providers.get(providerType);
        if (provider == null) {
            throw new IllegalArgumentException("[PROVIDER_TYPE] Not Exists: " + providerType);
        }
        return provider;
    }
}
