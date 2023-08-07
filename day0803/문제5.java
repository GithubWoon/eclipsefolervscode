import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String text = sc.nextLine();

        // 사용자로부터 검색할 문자 입력 받기
        System.out.print("검색할 문자를 입력하세요: ");
        char searchtext = sc.nextLine().charAt(0); // 입력한 문자열에서 가장 첫번째로 끌어올 문자

        // 검색한 문자가 몇 개 들어가 있는지 개수와 인덱스 출력
        int count = 0; // 개수?
        for (int a = 0; a < text.length(); a++) { // 초깃값 0개부터 시작, 개수 < 글자 길이수 까지 실행 반복문 실행, a 증가
            if (text.charAt(a) == searchtext) {
                count++;
                System.out.println("'" + searchtext + "'는 " + (a + 1) + "번째 인덱스에 위치합니다.");
            }
        }

        if (count == 0) {
            System.out.println("'" + searchtext + "'는 문자열에 존재하지 않습니다.");
        } else {
            System.out.println("'" + searchtext + "'는 총 " + count + "개 있습니다.");
        }

        sc.close();
    }
}