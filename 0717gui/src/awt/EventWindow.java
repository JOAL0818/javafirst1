package awt;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class EventWindow extends Frame {
	public EventWindow() {
		// �������� ������ǥ�� ũ�⸦ ����
		setBounds(200, 200, 400, 400);
		// �������� ������
		setTitle("�̺�Ʈó��");

		
		// ��ư�� ����
		Button btn1 = new Button("��ư1");
		// �������� ������Ʈ���� ���� �� �г� ����
		Panel panel = new Panel();
		// �гο� ��ư�߰�
		panel.add(btn1);
		// �г��� �����쿡 �߰�
		add(panel);
		// �����츦 ȭ�鿡 ���
		setVisible(true);

		
		// ��ư�� ������ �̺�Ʈ ó���� ActionListener�������̽��� ó���Ѵ�.
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		
		// ��ư�� �����ʿ���
		// btn1�� ActionEvent�� �߻��ϸ� listenr1�� �޼ҵ带 ȣ���ϵ��� ����
		btn1.addActionListener(listener1);

	}
}
