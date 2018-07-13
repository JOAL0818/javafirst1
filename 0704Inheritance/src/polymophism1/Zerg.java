package polymophism1;

public class Zerg extends Starcraft {

	//공격하는 메소드
	public void attack() {  //offence를 attack으로 수정 -> 메소드 이름은 한개만 기억하면 된다.
		System.out.println("저그의 공격");
	}
}
