package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); //포함된다면 true
        System.out.println(s.contains("C#")); // 포함 안된다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 7
        System.out.println(s.indexOf("c#")); // 포함이안되어 있다면 -1
        System.out.println(s.indexOf("and")); // 처음 위차하는 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막 일차하는 위치정보 (23)
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); //이 문자열로 시작하면 true
    }
}
