package awt;

import java.awt.*;

public class LoginWindow extends Frame {
	// ������ - �ν��Ͻ��� ���鶧 ȣ���ϴ� �޼ҵ�
	public LoginWindow() {
		// ũ��� ��ġ �� Ÿ��Ʋ����
		setSize(500, 500);
		setLocation(200, 200);
		setTitle("�α���");

		
		// �гλ���
		Panel panel = new Panel();

		
		Label label = new Label("���̵�");
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label lblPw = new Label("��й�ȣ");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		//txtPw.setEchoChar((char)97); - �̷��Ե� ����
		panel.add(lblPw);
		panel.add(txtPw);
		
		
		//������ �Է��� �� �ִ� �ؽ�Ʈ ���������
		TextArea ta = new TextArea(10,50);
		panel.add(ta);
		

		// �г��� �����ӿ� ����
		add(panel);

		
		//�޴��ٸ����
		MenuBar menuBar =new MenuBar();
		//�޴�����
		Menu file = new Menu("����(F)");
		//�޴��� �޴��ٿ� ����
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("���θ����");
		file.add(newFile);
		MenuItem save = new MenuItem("����");
		file.add(save);
	
		Menu edit = new Menu("����");
		MenuItem copy = new MenuItem("����");
		edit.add(copy);
		file.add(edit);
		
				
		//�޴��ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);
		
		
		// ȭ�����
		setVisible(true);
	}
}
