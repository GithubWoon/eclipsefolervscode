import java.util.Scanner;
public class Friday {
    public static void main(String[] args) {
        // 입력된 네 개의 수가 있습니다
        Scanner sc = new Scanner(System.in);

        // 실수
        System.out.print("첫번째 실수를 입력하세요");
        double num1 = sc.nextDouble();

        System.out.print("두번째 실수를 입력하세요");
        double num2 = sc.nextDouble();
        
        // 정수
        System.out.print("세번째 정수를 입력하세요");
        int num3 = sc.nextInt();

        System.out.print("네번째 정수를 입력하세요");
        int num4 = sc.nextInt();

        // 네 수를 검사해서 5보다 작은 수를 출력
        if (num1 < 5) {
            System.out.println(num1);
        }
        if (num2 < 5) {
            System.out.println(num2);
        }
        if (num3 < 5) {
            System.out.println(num3);
        }
        if (num4 < 5) {
            System.out.println(num4);
        }

        sc.close();
    }
}
