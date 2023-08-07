// 배열에서 특정순서 요소찾기
import java.util.*;

public class study3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10]; // arr 라는 배열에 10개의 정수를 넣을게
    int i;

    for (i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print(arr[2] + " " + arr[4] + " " + arr[arr.length - 1]);
  }
}