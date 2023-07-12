package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false; //자동신고기능 , static 클래스 변수

    void autoRepot() {
        if ( canAutoReport){
            System.out.println("감지되어자동신고");
        } else {
            System.out.println("안됨");
        }

    }

    void insertMemoryCard(int capacity) {
        System.out.println( "메모리카드 삽입됨");
        System.out.println("용량은" + capacity + "입니다");
    }

    int getVideoFileCount(int type) {
        if ( type == 1 ){ //일반영상
            return 9;
        }
        else if ( type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if ( showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 표시됨");
    }

    void record(){
        record(true,true,5);
    }


}
