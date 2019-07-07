package third;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.PropertySource;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanConfig.class);

        AbstractEnvironment abstractEnvironment = new AbstractEnvironment() {};
        // 这里要自己加一个属性源，因为纯spring没有只有system属性
        abstractEnvironment.getPropertySources().addLast(GCPropertySource.INSTANCE);

        // 设置环境配置
        abstractEnvironment.setActiveProfiles("dev");
        applicationContext.setEnvironment(abstractEnvironment);

        // 在refresh之前是不会取到config中的配置property source的
        System.out.println(abstractEnvironment.getProperty("gc.test"));

        //注意，要先把环境变量设置好，最后refresh， refresh代表将所有配置生效
        applicationContext.refresh();

        // 在refresh之后取到config中的配置property source
        System.out.println(applicationContext.getEnvironment().getProperty("gc.test"));

        SayClass sayClass = applicationContext.getBean(SayClass.class);
        sayClass.say();
    }
}
