package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming )
        // 유지 보수 용이
        // 높은 재사용성

        // 차량요 블박
        // 모델명, 해상도, 가격, 색상

        //첫번째 개발
        String modelName = "까망";
        String resolution = "FHD";
        int price = 200000;
        String color = "black";

        //새로운 제품개발
        String modelName2 = "하양";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "white";

        BlackBox bbox = new BlackBox();
        // BloackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

    }
}
