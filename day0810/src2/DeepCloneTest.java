// 객체복사 - 깊은복사
// 객체가 원시 타입인 경우
class DeepCloneTest {
    String name;
    int age;

    public DeepCloneTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person deepCopy() {
        return new DeepCloneTest(this.name, this.age);
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        DeepCloneTest original = new CloneTest("Alice", 30);
        DeepCloneTest copy = original.deepCopy(); // 깊은 복사

        copy.name = "Bob"; // 복사본의 필드 변경

        System.out.println(original.name); // 출력: Alice
    }
}

