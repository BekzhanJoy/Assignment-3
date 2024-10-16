public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        SmartHomeFacade facade = new SmartHomeFacade(light, thermostat);
        facade.arriveHome();
        facade.leaveHome();
    }
}
