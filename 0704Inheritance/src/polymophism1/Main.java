package polymophism1;

public class Main {

	public static void main(String[] args) {
		//3가지(테란,저그,프로토스)클래스의 공격하는 메소드를 호출
//		Terran t = new Terran();
//		t.attack();
//		Zerg z = new Zerg();
//		z.attack();
//		Protoss p = new Protoss();
//		p.attack();
		
		
		//메인메소드를 이렇게 수정한다. - 에러가 난다. why? 메모장참고 -> Starcraft 클래스를 수정한다.
		Starcraft star = new Terran();
		star.attack();
		star = new Zerg();
		star.attack();
		star = new Protoss();
		star.attack();


	}

}
