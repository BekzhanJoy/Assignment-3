public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Basic Remote: Toggling power");
        device.powerOn();
    }

    @Override
    public void changeChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void adjustVolume(int volume) {
        device.setVolume(volume);
    }
}
