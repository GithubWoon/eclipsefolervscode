public class Main {
    public static void main(String[] args) throws Exception {
        TVChild[] objArr1 = new TVChild[10];
        objArr1[0] = new TVChild(false, 10, 20);
        objArr1[1] = new TVChild(false, 10, 20);

        AudioChild[] objArr2 = new AudioChild[10];
        objArr2[0] = new AudioChild(true, 10);

        // 다형성
        // 여러 데이터 타입의 자식 객체를 부모타입으로 부름
        AudioTVParent objParent1 = new TVChild(true, 30, 40);
        AudioTVParent objParent2 = new AudioChild(true, 10);

        // 부모는 자식의 레퍼런스를 지정하는것이 가능
        AudioTVParent[] objArr = new AudioTVParent[2];
        objArr[0] = new TVChild(true, 30, 40);
        objArr[1] = new AudioChild(true, 10);
        
        // 부모는 자신의 영역에 있는
        // 필드나 메소드만 접근가능
        TVChild objTv = ((TVChild) objArr[0]);
        objTv.watch();
        AudioChild objAudio = ((AudioChild) objArr[1]);
        objAudio.tune();

    }
}
