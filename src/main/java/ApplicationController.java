import endpoints.SomeRestEndpoints;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class ApplicationController extends Application {

    private Set<Object> singletons = new HashSet<>();

    public ApplicationController() {
        singletons.add(new SomeRestEndpoints());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
