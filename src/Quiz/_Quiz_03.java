package Quiz;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0,8));

        id = "030708-4597890";
        System.out.println(id.substring(0, id.indexOf("-")+2)); // 0위치부터 하이픈 위치+2 직전까지



    }
}
