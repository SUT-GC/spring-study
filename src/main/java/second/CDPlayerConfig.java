package second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean
    public CompactDisc ipod() {
        Ipod ipod = new Ipod();

        return ipod;
    }

    @Bean
    public MetaPlayer ipodPlayer(Ipod ipod) {
        IpodPlayer ipodPlayer = new IpodPlayer();
        ipodPlayer.setCompactDisc(ipod);

        return ipodPlayer;
    }
}
