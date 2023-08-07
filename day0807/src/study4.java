public class study4 {

  public static void main(String[] args) {
    int[] reverse = new int[10]; // reverse 라는 배열에 정수 10개를 넣을게

    // 1부터 10까지의 값을 역순으로 배열에 저장, 출력
    for (int i = 0; i < reverse.length; i++) { // i는 0부터 시작 -> "i < 배열길이 10" 즉, i는 0부터 9까지 반복 -> i 증감 (i값은 점차 늘어남)
      reverse[i] = 10 - i; // reverse[i] 값에 저장할 값을 구함, reverse[0] 에는 10 -> 첫번째 자리, reverse[1] 에는 9 -> 두번쨰자리 i에 9까지 들어감
      System.out.print(reverse[i] + " "); // reverse[i] 에 저장된값들을 출력
    }

  }
}