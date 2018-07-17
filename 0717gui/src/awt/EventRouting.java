package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		// �������� ������ǥ�� ũ�⸦ ����
		setBounds(200, 200, 400, 400);
		// �������� ������
		setTitle("�̺�Ʈ�����");

		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		Label label = new Label();

		Panel centerPanel = new Panel();
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		add("Center", centerPanel);

		add("South", label);

		// ActionEvent�� ó���� �� �ִ� �ν��Ͻ������
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���");

			}
		};
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");

			}
		};
		
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		};

		btn1.addActionListener(listener1);
		btn2.addActionListener(listener2);
		btn3.addActionListener(listener3);

		// �����츦 ȭ�鿡 ���
		setVisible(true);
	}
}