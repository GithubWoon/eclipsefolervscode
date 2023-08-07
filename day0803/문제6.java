import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"}; // 배열을 만들어주었습니다
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("0부터 6까지 숫자를 입력하세요: ");
        int Number = sc.nextInt();
        
        if (Number >= 0 && Number <= 6) {
            System.out.println(days[Number] + "요일");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        
        sc.close();
    }
}