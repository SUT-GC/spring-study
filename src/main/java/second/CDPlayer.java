package second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MetaPlayer {

    @Autowired
    @Qualifier("magneticTape")
    private CompactDisc compactDisc;

    @Override
    public void play() {
        compactDisc.play();
    }
}
