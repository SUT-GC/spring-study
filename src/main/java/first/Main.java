package first;

import first.bean.Knight;
import first.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanConfig.class);
        applicationContext.refresh();

        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();

        applicationContext.close();
    }
}
