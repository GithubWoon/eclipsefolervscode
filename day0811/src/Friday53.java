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

public class Friday53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iA, iB, iC;
        int iType = 1; // 1: 정수로 2: 실수로

        // 키 입력처리 함수를 사용하여 값을 입력받음
        if (iType == 1) {
            iA = readInt(sc, "첫번째 정수를 입력하세요: ");
            iB = readInt(sc, "두번째 정수를 입력하세요: ");
            iC = readInt(sc, "세번째 정수를 입력하세요: ");
        } else {
            iA = (int) readDouble(sc, "첫번째 실수를 입력하세요: ");
            iB = (int) readDouble(sc, "두번째 실수를 입력하세요: ");
            iC = (int) readDouble(sc, "세번째 실수를 입력하세요: ");
        }

        // 작은 값들을 저장하는 배열 생성
        int[] smallValues = new int[3];
        int count = 0;

        // 5보다 작은 수들을 배열에 저장
        if (iA < 5) {
            smallValues[count] = iA;
            count++;
        }
        if (iB < 5) {
            smallValues[count] = iB;
            count++;
        }
        if (iC < 5) {
            smallValues[count] = iC;
            count++;
        }

        // 배열의 작은 값을 정렬하여 출력
        for (int a = 0; a < count; a++) {
            for (int b = a + 1; b < count; b++) {
                if (smallValues[a] > smallValues[b]) {
                    int temp = smallValues[a];
                    smallValues[a] = smallValues[b];
                    smallValues[b] = temp;
                }
            }
        }

        System.out.println("5보다 작은 숫자는:");
        for (int a = 0; a < count; a++) {
            System.out.println(smallValues[a]);
        }

        sc.close();
    }

    // 키 입력처리 함수
    public static double readDouble(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static int readInt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
