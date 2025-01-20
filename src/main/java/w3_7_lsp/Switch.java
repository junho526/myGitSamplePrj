package w3_7_lsp;

public class Switch {
    private RedLight light;
    
    public Switch() {
        this.light = new RedLight();
    }
    
    public void flip() {
        if (light != null) {
            light.on();
        }
    }
}

class RedLight {
    public void on() {
        System.out.println("Red Light turned on");
    }
}