package factories;

import providers.InstanceRegistry;
import providers.Provider;

public class ProviderFactory {
    public static Provider getProvider(String providerType) {
        Provider provider = InstanceRegistry.getProvider(providerType);
        if (provider == null) {
            throw new IllegalArgumentException("[PROVIDER_TYPE] Not Exists: " + providerType);
        }
        return provider;
    }
}
