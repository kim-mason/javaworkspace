package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        System.out.println(b1.modelName);
    }
}
