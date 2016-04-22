package item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceProviderFrameworkSketch {
}


//Service Interface

interface Service {
    //Service-specific methods go here
}

//Service Provider interface
interface Provider {
    Service newService();
}

//NonInstantiable class for service registration and access

class Services {
    public static final String DEFAULT_PROVIDER_NAME = "IS";

    private Services() {
    } //Prevents instantiation (Item4)

    //Maps service names to services
    public static final Map<String, Provider> providers =
            new ConcurrentHashMap<>();

    //Provider registration API
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    //Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException(
                    "No provider registered with name:" + name);
        return p.newService();
    }
}

