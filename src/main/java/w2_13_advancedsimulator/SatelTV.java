package w2_13_advancedsimulator;

public class SatelTV extends TV {
    public SatelTV(int channel, int volume, int brightness, int contrast) {
        super(channel, volume, brightness, contrast);
    }

    @Override
    public String getType() {
        return "SatelTV ";
    }
}
