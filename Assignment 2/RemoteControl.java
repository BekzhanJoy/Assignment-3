public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void changeChannel(int channel);
    public abstract void adjustVolume(int volume);
}
