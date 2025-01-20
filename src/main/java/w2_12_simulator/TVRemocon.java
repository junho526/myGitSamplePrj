package w2_12_simulator;

import java.util.Scanner;

public class TVRemocon {
    final static String power = "pow";
    final static String cn_up ="ch_up";
    final static String cn_down ="ch_down";
    final static String li_up ="li_up";
    final static String li_down ="li_down";
    final static String con_up ="con_up";
    final static String con_down ="con_down";
    final static String vol_up ="vol_up";
    final static String vol_down ="vol_down";

    private TV tv;

    public TVRemocon() {
    }

    public void btnPress(TV tardetTV,String btnInput) {
        switch (btnInput) {
            case power:
                tardetTV.OnOff();
                break;
            case cn_up:
                tardetTV.ChannelUp();
                break;
            case cn_down:
                tardetTV.ChannelDown();
                break;
            case li_up:
                tardetTV.LightUp();
                break;
            case li_down:
                tardetTV.LightDown();
                break;
            case con_up:
                tardetTV.ContrastUp();
                break;
            case con_down:
                tardetTV.ContrastDown();
                break;
            case vol_up:
                tardetTV.VolumeUp();
                break;
            case vol_down:
                tardetTV.VolumeDown();
                break;


        }

    }
}
