package frame;

import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() { // �����ڸ� �������.
		setTitle("üũ�ڽ��׽�Ʈ");
		setLocation(100, 100);
		setSize(500, 500);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("���ǰ���");
		Checkbox cb3 = new Checkbox("����");
		Checkbox cb4 = new Checkbox("���α׷���");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);

		// ������ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group, false);
		p.add(man);
		p.add(woman);

		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		p.add(ch);

		// 5���� �����ְ� �������� ������ �� �ֵ��� ���ִ� List
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
		//list�� remove(int idx)�� �̿��ϸ� idx��°�� ���� �� �ֽ��ϴ�.
		//ù��°�� �ִ� C&C++�� 5��°�� �ִ� Objective-C����
		//�������� ���ﶧ�� �ڿ������� �����ؾ��Ѵ�. - �չ�ȣ�� �ε����� ���� / �޹�ȣ�� �ε����� �������� �ʴ´�
		list.remove(4);
		list.remove(0);
		
	
		add(p);
		setVisible(true);
	}
}
