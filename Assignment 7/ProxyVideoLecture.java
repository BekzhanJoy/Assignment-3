public class ProxyVideoLecture implements VideoLecture {
    private RealVideoLecture realVideoLecture;
    private String videoName;

    public ProxyVideoLecture(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void getInfo() {
        System.out.println("Proxy: Video Info - " + videoName);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(videoName);
        }
        realVideoLecture.play();
    }
}
