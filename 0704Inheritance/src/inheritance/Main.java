package inheritance;

public class Main {

	public static void main(String[] args) {
		//생성자를 찾는다. 
		Employee emp1 = new Employee();
		//객체의 내용을 확인하고자하면 System.out.println 메소드에 객체의 이름만 대입하면 된다.
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		System.out.println(emp2);
	
	
		//직책관련한 객체를 만들 수 있다.
		Manager man1 = new Manager();
		System.out.println(man1);
	
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
