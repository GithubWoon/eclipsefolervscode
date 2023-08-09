// 계산기

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0; // 계산결과의 변수, 결과의 초깃값, 0 그리고 정수까지만 나타남

        while (true) { //
            System.out.println("계산기 프로그램");
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("0. 종료");
            System.out.print("원하는 작업을 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    return;
                case 1:
                    result = performAddition(scanner, result);
                    break;
                case 2:
                    // 뺄셈 구현
                    break;
                case 3:
                    // 곱셈 구현
                    break;
                case 4:
                    // 나눗셈 구현
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }

    //

    public static int performAddition(Scanner scanner, int result) {
        System.out.println("덧셈영역 입니다");
        System.out.println("초기값: 0");
        
        while (true) {
            System.out.print("더할 숫자를 입력하세요 (r을 입력하면 결과를 볼 수 있음): ");
            String input = scanner.next();

            if (input.equals("r")) {
                System.out.println("결과: " + result);
            } else {
                try {
                    int number = Integer.parseInt(input); // 정수로 변경
                    result += number;
                } catch (NumberFormatException e) {
                    System.out.println("숫자 또는 r을 입력하세요.");
                }
            }
        }
    }

    // 뺄셈, 곱셈, 나눗셈 구현 메서드 추가

}
