package chap_07;

import java.util.Random;
import java.util.Scanner;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        Random random = new Random();
        System.out.println(random.nextInt(10));

        for (int i = 0; i < 7; i++) {
            System.out.println(random.nextInt(45) + 1);
        }

        Scanner in = new Scanner(System.in);

        System.out.println(in.nextInt());
        // Math, Scanner, StringBuilder, StringBuffer, StringToekenizer
    }
}
