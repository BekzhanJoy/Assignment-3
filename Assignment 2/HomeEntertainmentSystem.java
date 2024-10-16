public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl remote = new BasicRemote(tv);

        remote.togglePower();
        remote.changeChannel(5);
        remote.adjustVolume(15);
        remote.togglePower();
    }
}
