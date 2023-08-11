// public class Friday3 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int iA, iB, iC;
//     int iType = 1; // 1: 정수로 2: 실수로
//     // 함수명A(sc, 값1, 값2);
//     // 함수명A(sc, 2); // 함수 호출
//     // 세 개중 하나롣 5보다 작은 수 출력
//   }
//     // 키 입력처리 함수
//     // public static void 함수명A(SCcanner sc, 파라미터1, 파라미터2) void가 있을땐 return  안됨
//     // 변수선언 == 파라미터 지정방법 -> int a
    
//     // {
//     //   조건
//     //   명령문
//     // }
  
// }

import java.util.Scanner;

public class Friday35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iA, iB, iC;
        int iType = 1; // 입력타입 // 1: 정수로 2: 실수로

        // 정수로 키 입력 처리 함수 호출 
        if (iType == 1) {
            iA = readInt(sc, "첫번째 정수를 입력하세요: "); // readInt 함수에 매개변수 sc, msg 를 포함시켰었음
            iB = readInt(sc, "두번째 정수를 입력하세요: ");
            iC = readInt(sc, "세번째 정수를 입력하세요: ");
        }
        // 실수로 키 입력 처리 함수 호출 (정수반환필요)
        else if (iType == 2) {
            iA = (int) readDouble(sc, "첫번째 실수를 입력하세요: "); // 실수값을 정수로 반환하기 위해서 int 를 적용해줬음
            iB = (int) readDouble(sc, "두번째 실수를 입력하세요: "); // readDouble 함수에 매개변수 sc,msg 를 포함시켰었음
            iC = (int) readDouble(sc, "세번째 실수를 입력하세요: ");
        }
        // 기본값은 정수로 처리
        else {
            iA = readInt(sc, "첫번째 정수를 입력하세요: "); 
            iB = readInt(sc, "두번째 정수를 입력하세요: ");
            iC = readInt(sc, "세번째 정수를 입력하세요: ");
        }

        // 세 수 중에서 5보다 작은 수 출력
        if (iA < 5) {
            System.out.println("5보다 작은 수: " + iA);
        }
        if (iB < 5) {
            System.out.println("5보다 작은 수: " + iB);
        }
        if (iC < 5) {
            System.out.println("5보다 작은 수: " + iC);
        }



        sc.close();
    }

    // 정수 키 입력 처리 함수생성
    public static int readInt(Scanner scanner, String msg) {
        System.out.print(msg);
        return scanner.nextInt(); // 이해필요 // 입력받은값을 돌려줘야함
    }

    // 실수 키 입력 처리 함수생성
    public static double readDouble(Scanner scanner, String msg) {
        System.out.print(msg);
        return scanner.nextDouble(); // 이해필요
    }
    
}
