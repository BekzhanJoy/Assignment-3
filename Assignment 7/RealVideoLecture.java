public class RealVideoLecture implements VideoLecture {
    private String videoName;

    public RealVideoLecture(String videoName) {
        this.videoName = videoName;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + videoName);
    }

    @Override
    public void getInfo() {
        System.out.println("Video Info: " + videoName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + videoName);
    }
}
