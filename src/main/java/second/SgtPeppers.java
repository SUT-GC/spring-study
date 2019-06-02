package second;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("sat peppers.......");
    }
}
