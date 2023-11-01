public class LightSwitch {
    private LightDevice device;

    public LightSwitch(LightDevice device) {
        this.device = device;
    }

    public void turnOnLight() {
        device.turnOn();
    }

    public void turnOffLight() {
        device.turnOff();
    }
}
