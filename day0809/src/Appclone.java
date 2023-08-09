// 계산기 클론연습
// 이해가 애매한 부분은 디버깅 표시 해놨음

import java.util.Scanner;

public class Appclone {

  public static void main(String[] args) { // void 메서드 함수호출
    Scanner scanner = new Scanner(System.in);
    int result = 0; // 계산결과의 변수, 결과의 초깃값 0, int 를 사용하여 정수까지만 나타나게

    while (true) { // 무한 반복문 시작
      System.out.println("계산기 프로그램");
      System.out.println("1. 덧셈");
      System.out.println("2. 뺼셈");
      System.out.println("3. 곱셈");
      System.out.println("4. 나눗셈");
      System.out.println("0. 종료");
      System.out.print("원하는 작업을 선택하세요: ");

      int choice = scanner.nextInt(); // 정수형 변수, 선택이라는 변수를 만듦, 정수만 인식함

      // switch, case, default 는 대부분 같이 세트
      // if, else if, else
      // then, catch
      // try, catch

      switch (choice) { // switch(변수) 일때 실행할 구문
        case 0: // 0을 입력했을때
          System.out.println("계산기를 종료합니다");
          return; // main 메서드를 종료시켜 계산기를 종료한다

        case 1: // 덧셈
          result = Addresult(scanner, result); // Addresult 는 내가 임의로 정한 메서드 매개변수로 scanner, result *매개변수 이해필요*
          break;

        case 2: // 뺄셈
          break;

        case 3: // 곱셈
          break;

        case 4: // 나눗셈
          break;

        default: // default 랑 else 랑 비슷한 느낌 예외문구 
          System.out.println("잘못된 선택입니다 메뉴의 번호를 선택해주세요");
      }

    }
  }

  // 덧셈 기능
  public static int Addresult(Scanner scanner, int result); // Addresult 메서드 생성 = 함수생성 scanner, result 매개변수로 받아옴 입력값, 결과값
    System.out.println("덧셈작업 영역입니다");
    System.out.println("초기값: 0");

    while(true) { // 무한 반복문 시작
      System.out.println("")
    }
} 
