package third;

import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

public class GCPropertySource extends PropertySource<String> {

    private Map<String, String> resource = new HashMap<>();

    public GCPropertySource(String name, String source) {
        super(name, source);
        this.resource.put(name, source);
    }

    public GCPropertySource(String name) {
        super(name);
        this.resource.put(name, "1");
    }

    @Override
    public Object getProperty(String name) {
        return this.resource.get(name);
    }

    public static GCPropertySource INSTANCE = new GCPropertySource("gc");
}
