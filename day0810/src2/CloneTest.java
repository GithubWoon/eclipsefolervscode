// 객체복사 - 얕은복사
// 객체가 참조 타입인 경우
class CloneTest { // name, age 필드를 가지는 CloneTest 클래스를 정의합니다
    String name;
    int age;

    // CloneTest 클래스에 생성자를 만들고 객체를 초기화한다
    public CloneTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) { // main 메서드 main 함수를 실행합니다
        CloneTest original = new CloneTest("Alice", 30); // CloneTest 클래스의 객체 original을 생성하고 초기화
        CloneTest copy = original; // original의 참조를 copy에 할당 (얕은 복사)

        copy.name = "Bob"; // copy의 name 필드를 변경

        System.out.println(original.name); // 출력: Bob (original 객체도 변경됨)
    }
}
