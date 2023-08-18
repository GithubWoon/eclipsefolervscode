public class Child extends Parent {
	private int child01;
	
	// 아무런 초기화 작업을 하지않는 기본 생성자
	public Child() {}

	// 인자를 받아 초기화하는 생성자
	public Child(int child01) {
		this.child01 = child01;
	}
	
	public int getChild01() {
		return child01;
	}
	public void setChild01(int child01) 
	{
		this.child01 = child01;
	}
}
