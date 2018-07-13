package polymophism;

public class Main {
	public static void main(String[]args) {
		
//		//Super클래스의 인스턴스를 생성
//		Super base = new Super();
//		//Sub 클래스의 인스턴스를 생성
//		Sub drive = new Sub();
//		
//		
//		//상위클래스타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있다.(형변환 없이)
//		Super ob1 = new Sub(); 
//		//하위클래스타입의 변수에 상위클래스 타입의 인스턴스 주소를 대입하는 것은 강제형변환을 통해서만 가능 
//		//이렇게 할 경우 문제가 발생될 수도 있다. - 예외발생  
//		//*앞에 (Sub)하면 강제형변환 가능
//		Sub ob2=(Sub) new Super(); //에러(오류)는 아니다. 빨간줄은 없는데 실행이 안된다면 '예외'이다. ┌ 예외 메시지 
//		                           //Exception in thread "main" java.lang.ClassCastException: polymophism.Super cannot be cast to polymophism.Sub
//		                           //           at polymophism.Main.main(Main.java:15)
	
		
		
		//상위 클래스 타입의 변수에 하위클래스 타입의 주소를 대입할 수 있습니다.
		//기본적으로 obj는 Super의 것만 호출할 수 있다.(그 아래 obj.누르고 보면  Super클래스의 메소드만 보인다.)
		
		
		//오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출합니다. 
		Super obj = new Super();  // - 오버라이딩 된 메소드는 우측을 보고 부른다. cf)오바리이딩 안된것은 자기자신것을 부르고 
		obj.display();			  //Super의 display를 부른다.
		                               // 위 아래처럼 코드가 같은데, 누굴 다입하느냐에 따라 다른코드를 수행 : 다형성
		obj=new Sub();			  //Sub의 display를 부른다. 
		obj.display();
		
		
	}
}
