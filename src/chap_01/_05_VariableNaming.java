package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(a,b,c), 숫자(1,2,3) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 ( public, static, void, int, double, float....

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String fistName = "동기"; // 이름
        String lastName = "홍"; // 성
        String dae_Of_Birth = "1987-08-16"; // 생년월일
        String residental_Adress = "무슨 호텔"; // 체류지
        String purpose_Of_Visit = " 관광"; // 입국목적
        String flight_No = "KE657"; // 항공편명
        String flightNo = "KE657"; // 밑줄시작
        String flight_no_2 = "KE657";
//        String -flightNo = "KE657";

        int accompny = 2; // 동반가족수
        int lengthOfStay = 5; // 체류기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "전자제품";

//      프로그래매 흐름을 위해 사용되는 경우 등 (ㅋ게 이름이 중요하진 앟늘떄
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KOR";
    }
}
