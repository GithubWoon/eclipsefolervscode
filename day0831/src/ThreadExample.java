// 클래스 생성, 변수 선언
public class ThreadExample extends Thread {
    private String message;
    private long sleepTime;

    // 생성자 추가해서 messagem, sleepTime 을 파라미터로 받고 초기화
    public ThreadExample(String message, long sleepTime) {
        this.message = message;
        this.sleepTime = sleepTime;
    }

    // 동작
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + ": " + i);
            try {
                Thread.sleep(sleepTime); // 스레드는 지정된 시간동안 대기
            
            // InterruptedException e 는 자바의 표준 예외 클래스
            } catch (InterruptedException e) { // 다른 스레드가 현재 스레드를 깨우려고 할때 InterruptedException 예외를 던질수 있음
                e.printStackTrace(); // 예외가 발생한 경우 해당 예외의 스택 트레이스 정보를 출력해주는 메서드, 예외가 어떤 경로를 따라 발생했는지, 어떤 메서드들이 호출되있는지를 보여주는 정보를 포함하는 메서드
            }
        }
    }

    // 호출
    public static void main(String[] args) {
        ThreadExample mainThread = new ThreadExample("메인 스레드 실행", 500); // 대기시간 0.5초
        ThreadExample thread1 = new ThreadExample("스레드 실행", 1000); // 대기시간 1초
        ThreadExample thread2 = new ThreadExample("스레드2 실행", 200); // 대기시간 0.2초

        mainThread.start();
        thread1.start();
        thread2.start();
    }
}
