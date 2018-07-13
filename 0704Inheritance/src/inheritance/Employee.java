package inheritance;

//직원의 정보를 저장하기 위한 클래스
public class Employee {
	//번호와 이름을 저장하기 위한 변수
	//private int num;
	//private String name;
	
	//상속받은 곳에서 사용할 수 있도록 위의 private을 protected로 변경
	private int num;
	private String name;
	


	//num의 값을 일련번호로 만들기 위한 공유변수 : 항상 static으로 만든다.
	private static int autoincrement;
	
	//생성자(constructor)
	//public Employee() {
	public Employee(int n){ //이렇게 쓰면 main과 manage에 둘다 에러가 난다. int를 받아야 하는데 디폴트니까.
		//일련번호 만들기
		autoincrement = autoincrement + 1; //일련번호가 하나씩 증가하도록
		num = autoincrement;
	}
	
	
	//인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//값을 확인하기 쉽게 하기위한 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
	
	
}
