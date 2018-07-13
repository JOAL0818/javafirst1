package inheritance;


//Employee 클래스를 상속받은 Manager 클래스(상위클래스) 
public class Manager extends Employee {
	//public void x() {
		//num=10;		// "The field Employee.num is not visible" 보이지 않는다는 오류메시지가 나타난다.
	
	//상위클래스에서(Employee) public Employee(int n)이것으로 인해 에러 발생한 경우, 
	//첫줄에 이렇게 생성자를 만들어야 오류가 없어진다.
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는 안드로이드에서 많이 발생합니다.
	public Manager() {
		super(10);
	}
		
	//직책을 저장할 변수
	private String task;

	public String getTask() {
		return task;
	}

	//메소드의 원형 :setTask(String)
	public void setTask(String task) {
		this.task = task;
	}

	
	@Override
	public String toString() {
		//super.toString() 추가하면 상위클래스인 Emloyee의 toString을 호출합니다.
		return super.toString() +"Manager [task=" + task + "]"; 
	}
	
			
}
