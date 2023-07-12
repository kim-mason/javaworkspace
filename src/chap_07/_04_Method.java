package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";

        b1.autoRepot(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoRepot(); // 지원 됨

        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반영상파일수"+ fileCount );

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트영상 " + fileCount);
    }
}
