package frame;

import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() { // 생성자를 만들었다.
		setTitle("체크박스테스트");
		setLocation(100, 100);
		setSize(500, 500);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("음악감상");
		Checkbox cb3 = new Checkbox("게임");
		Checkbox cb4 = new Checkbox("프로그래밍");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);

		// 라디오버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);
		p.add(man);
		p.add(woman);

		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		p.add(ch);

		// 5개를 보여주고 여러개를 선택할 수 있도록 해주는 List
		List list = new List(5, true);
		list.add("C&C++");
		list.add("C#");
		list.add("Java");
		list.add("JavaScript");
		list.add("Objective-C");
		list.add("Python");
		list.add("Swift");
		list.add("Kotlin");
		list.add("Scala");
		p.add(list);
		//list의 remove(int idx)를 이용하면 idx번째를 지울 수 있습니다.
		//첫번째에 있는 C&C++과 5번째에 있는 Objective-C제거
		//여러개를 지울때는 뒤에서부터 삭제해야한다. - 앞번호는 인덱스에 영향 / 뒷번호는 인덱스에 영향주지 않는다
		list.remove(4);
		list.remove(0);
		
	
		add(p);
		setVisible(true);
	}
}
