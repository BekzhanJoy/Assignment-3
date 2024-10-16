public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;

    public SmartHomeFacade(Light light, Thermostat thermostat) {
        this.light = light;
        this.thermostat = thermostat;
    }

    public void leaveHome() {
        light.off();
        thermostat.setTemperature(18);
        System.out.println("House set to away mode.");
    }

    public void arriveHome() {
        light.on();
        thermostat.setTemperature(22);
        System.out.println("Welcome home!");
    }
}
