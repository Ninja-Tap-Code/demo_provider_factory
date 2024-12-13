package factories;

import providers.Provider;
import util.ClassScanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProviderFactory {

    private static final Map<String, Provider> providers = new HashMap<>();

    static {
        try {
            // Tìm tất cả class implement interface Provider
            Set<Class<? extends Provider>> providerClasses = ClassScanner.findSubTypes("providers", Provider.class);
            for (Class<? extends Provider> providerClass : providerClasses) {
                Provider providerInstance = providerClass.getDeclaredConstructor().newInstance(); // Tạo 1 instance của lớp đó
                String providerType = providerClass.getSimpleName().toLowerCase();
                providers.put(providerType, providerInstance);
            }
        } catch (Exception e) {
            System.out.println("[SCAN_PACKAGE] Fail: " + e.getMessage());
        }
    }

    public static Provider getProvider(String providerType) {
        Provider provider = providers.get(providerType);
        if (provider == null) {
            throw new IllegalArgumentException("[PROVIDER_TYPE] Not Exists: " + providerType);
        }
        return provider;
    }
}
