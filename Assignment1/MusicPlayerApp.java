public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();
        player.play("mp3", "song.mp3");

        AudioPlayer adapter = new AudioAdapter("wav");
        adapter.play("wav", "song.wav");

        adapter = new AudioAdapter("aac");
        adapter.play("aac", "song.aac");
    }
}
