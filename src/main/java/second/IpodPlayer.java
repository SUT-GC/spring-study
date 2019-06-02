package second;

public class IpodPlayer implements MetaPlayer {

    private CompactDisc compactDisc;

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
