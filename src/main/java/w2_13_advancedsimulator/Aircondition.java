package w2_13_advancedsimulator;

public class Aircondition implements Aircon {

    private boolean isOn;
    private int speed;
    private int degree;
    private int vector;

    public Aircondition(int speed, int degree, int vector) {
        this.isOn = false;
        this.speed = speed;
        this.degree = degree;
        this.vector = vector;
    }


    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDegree() {
        return degree;
    }

    public int getVector() {
        return vector;
    }

    @Override
    public void powerToggle() {
        isOn = !isOn;
        System.out.println(isOn ? "Aircondition is now ON." : "Aircondition is now OFF.");
    }

    @Override
    public void speedUp() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        speed++;
        System.out.println("Fan speed increased to: " + speed);
    }

    @Override
    public void speedDown() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        speed--;
        System.out.println("Fan speed decreased to: " + speed);
    }

    @Override
    public void degreeUp() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        degree++;
        System.out.println("Temperature increased to: " + degree);
    }

    @Override
    public void degreeDown() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        degree--;
        System.out.println("Temperature decreased to: " + degree);
    }

    @Override
    public void vectorUp() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        vector++;
        System.out.println("Vector direction increased to: " + vector);
    }

    @Override
    public void vectorDown() {
        if (!isOn) {
            System.out.println("Aircondition is OFF.");
            return;
        }
        vector--;
        System.out.println("Vector direction decreased to: " + vector);
    }
}
