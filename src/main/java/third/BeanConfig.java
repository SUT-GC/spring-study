package third;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:/third.properties")
public class BeanConfig {

    @Value("${gc.test}")
    private Integer gcPT;

    @Value("#{T(Math).PI * 2 / 2}")
    private Double gcPT2;

    @Bean
    @Profile("default")
    public SuperInterface devSuperInterface() {

        return new DevSuperInterfaceImpl();
    }

    @Bean
    @Profile("dev")
    @Conditional(MyConditional.class)
    public SuperInterface gcSuperInterface() {
        System.out.println("gcPT =" + gcPT);
        System.out.println("gcPT2 =" + gcPT2);

        return new GCSuperInterfaceImpl();
    }

    @Bean
    @Profile("prod")
    public SuperInterface prodSuperInterface() {

        return new ProdSuperInterfaceImpl();
    }
}
