package w2_12_simulator;

public class TV {
    private boolean isOn;
    private int channel;
    private int volume;
    private int light;
    private int contrast;

    public TV(int i, int i1, int i2, int i3){
        this.isOn = false;
        this.channel = 0;
        this.volume = 10;
        this.light = 30;
        this.contrast = 30;
    }

    public void OnOff(){
        if(this.isOn){
            this.isOn = false;
            System.out.println("Off");
            return;
        }
        this.isOn = true;
        System.out.println("On");
    }

    public void ChannelUp(){
        if(!isOn){
            channel++;
            System.out.println("Up");
        }
        else{
            return;
        }
    }
    public void ChannelDown(){
        if(!isOn){
            channel--;
            System.out.println("Down");
        }
        else{
            return;
        }
    }

    public void VolumeUp(){
        if (!isOn){
            volume++;
            System.out.println("volume up");
        }
        else{
            return;
        }
    }

    public void VolumeDown(){
        if(!isOn){
            volume--;
            System.out.println("volume down");
        }
        else{
            return;
        }
    }

    public void ContrastUp(){
        if(!isOn){
            contrast++;
            System.out.println("contrast up");
        }
        else{
            return;
        }
    }

    public void ContrastDown(){
        if(!isOn){
            contrast--;
            System.out.println("contrast down");
        }
        else{
            return;
        }
    }

    public void LightUp(){
        if(!isOn){
            light++;
            System.out.println("light up");
        }
        else{
            return;
        }
    }

    public void LightDown(){
        if(!isOn){
            light--;
            System.out.println("light down");
        }
        else{
            return;
        }
    }


}
