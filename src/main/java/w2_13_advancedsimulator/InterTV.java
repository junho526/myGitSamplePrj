package w2_13_advancedsimulator;

public class InterTV extends TV {
    public InterTV(int channel, int volume, int brightness, int contrast) {
        super(channel, volume, brightness, contrast);
    }

    @Override
    public String getType() {
        return "InterTV ";
    }
}
