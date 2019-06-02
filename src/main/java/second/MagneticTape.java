package second;

import org.springframework.stereotype.Component;

@Component
public class MagneticTape implements CompactDisc {
    @Override
    public void play() {
        System.out.println("magnetic tape .......");
    }
}
