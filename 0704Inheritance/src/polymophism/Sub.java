package polymophism;

//Super클래스를 상속받는 Sub클래스
public class Sub extends Super {
	
	//Super클래스의 display메소드를 오버라이딩한다. - 이렇게 상위클래스에서 만든 메소드를 하위클래스에서 만드는 것을 override라고 한다.
	@Override  // 어노테이션을 붙였을 때 에러가 발생하지 않으면 오버라이딩이 제대로 된것이다.
	public void display() {
		System.out.println("How are you?");		
	}
	
	//하위클래스에 만든 메소드
	public void method() {
		System.out.println("하위클래스에서 만든메소드");		
	}
	
}
