package _chap6;

public class Method {

    public static String getPower(String text, int number ) {
        // length() 문자열 길이
        // substring()
        String result = text.substring( 0, number );
        for (int i = 0; i < text.length()-number; i++) {
            result += "*";
        }
        return result;
    }
    public static void main(String[] args) {

        String name = "나코딩";
        String num = "990101-1234567";
        String phone = "010-1234-5678";

        System.out.println( getPower(name,1 ));



    }
}
