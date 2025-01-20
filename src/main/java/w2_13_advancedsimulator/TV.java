package w2_13_advancedsimulator;

public abstract class TV {
    private boolean isOn;
    private int channel;
    private int volume;
    private int brightness;
    private int contrast;

    public TV(int channel, int volume, int brightness, int contrast) {
        this.isOn = false;
        this.channel = channel;
        this.volume = volume;
        this.brightness = brightness;
        this.contrast = contrast;
    }

    public void powerToggle() {
        isOn = !isOn;
        System.out.println(isOn ? getType() + " is ON." : getType() + " is OFF.");
    }

    public void channelUp() {
        if (ensurePowerOn()) {
            channel++;
            System.out.println(getType() + channel);
        }
    }

    public void channelDown() {
        if (ensurePowerOn()) {
            channel--;
            System.out.println(getType() + channel);
        }
    }

    public void volumeUp() {
        if (ensurePowerOn()) {
            volume++;
            System.out.println(getType()  + volume);
        }
    }

    public void volumeDown() {
        if (ensurePowerOn()) {
            volume--;
            System.out.println(getType()  + volume);
        }
    }

    public void lightUp() {
        if (ensurePowerOn()) {
            brightness++;
            System.out.println(getType()  + brightness);
        }
    }

    public void lightDown() {
        if (ensurePowerOn()) {
            brightness--;
            System.out.println(getType()  + brightness);
        }
    }

    public void contrastUp() {
        if (ensurePowerOn()) {
            contrast++;
            System.out.println(getType() + contrast);
        }
    }

    public void contrastDown() {
        if (ensurePowerOn()) {
            contrast--;
            System.out.println(getType()  + contrast);
        }
    }

    private boolean ensurePowerOn() {
        if (!isOn) {
            System.out.println(getType() + " is OFF");
            return false;
        }
        return true;
    }

    public abstract String getType();
}
