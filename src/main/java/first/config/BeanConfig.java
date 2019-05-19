package first.config;

import first.bean.Knight;
import first.bean.Quest;
import first.bean.impl.BravenKnight;
import first.bean.impl.MockQuest;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Knight knight() {

        return new BravenKnight(quest());
    }

    @Bean
    public Quest quest() {

        return new MockQuest();
    }
}
