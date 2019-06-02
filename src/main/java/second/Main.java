package second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(CDPlayerConfig.class);
        applicationContext.refresh();

        MetaPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
        cdPlayer.play();

        MetaPlayer ipodPlayer = applicationContext.getBean(IpodPlayer.class);
        ipodPlayer.play();
    }
}
