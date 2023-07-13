package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0; // 시리얼 번호 생성해주는 역할 ( 처음엔 0 -> ++ 연산 )
    static boolean canAutoReport = false; //자동신고기능 , static 클래스 변수

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println(this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {

//        this(); //기본생성자호출
//
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;


    }

    void autoRepot() {
        if (canAutoReport) {
            System.out.println("감지되어자동신고");
        } else {
            System.out.println("안됨");
        }

    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드 삽입됨");
        System.out.println("용량은" + capacity + "입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 표시됨");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터");


    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    //Getter Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자 문의바람";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
