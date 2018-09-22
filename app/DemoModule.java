import com.google.inject.AbstractModule;
import securesocial.core.RuntimeEnvironment;
import service.MyEnvironment;


public class DemoModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(RuntimeEnvironment.class).to(MyEnvironment.class);
    }
}
