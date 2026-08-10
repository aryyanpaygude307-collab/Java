interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light is turned ON");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON");
    }
}

public class SwitchableApp {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switchable fan = new Fan();

        light.turnOn();
        fan.turnOn();
    }
}
