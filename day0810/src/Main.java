// 기본 패키지는 별도의 import 없이도 사용할 수 있다 
public class Main {
    public static void main(String[] args) {
        Book book = new Book( // new Book : Book 이라는 객체 안에 "꿀벌의 예언", "베르나르", "인류의 미래" 를 넣는다
            "꿀벌의 예언 1",
            "베르나르베르베르",
            "인류의 미래를 둘러싸고 펼쳐지는 대모험"
        );

        System.out.println(book.toString());
        System.out.println(book);
    }
}
