package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealEventRouting extends Frame {
	public RealEventRouting() {
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
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�̺�Ʈ�� �߻��� ������Ʈ�� ���ڿ��� ������ �б�
				switch(e.getActionCommand()) {
				case "�ѱ���":
					label.setText("�ȳ��ϼ���");
					break;
				case "����":
					label.setText("Hello");
					break;
				case "����":
					System.exit(0);
					break;
				
				}
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);

		// �����츦 ȭ�鿡 ���
		setVisible(true);
	}
}
