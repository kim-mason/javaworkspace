package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.setModelName("하양");
        b1.setResolution("hd");

        System.out.println(b1.getModelName());
    }
}
