public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("Bekzhan"));
        course.addLecture(new ProxyVideoLecture("Kuanysh"));
        course.addLecture(new ProxyVideoLecture("Video"));

        course.showLectureInfo();
        System.out.println("\nNow playing videos:");
        course.playLecture(0);
        course.playLecture(2);
    }
}
