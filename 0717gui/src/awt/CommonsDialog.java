package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	//������ - �ν��Ͻ��� �����Ҷ� ȣ���ϴ� �޼ҵ�
	public CommonsDialog() {
		//��-��ġ, ��-ũ�� ���ü���
		setBounds(200,200,600,600);
		//������
		setTitle("�����ȭ����");
		
		//-----���ϴ�ȭ���ڸ���� 
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ� ������ ���ϰ�θ� ���̺� ���
		//����ü ������, ù��° �Ű������� Dialog�� Frame�� �ּ��ε� ������ ���� this�� �����ϸ� �ȴ�. **�����߿�- dialog���� parent�����ϱ�
		
		//FileDialog �ν��Ͻ�����
		FileDialog fileDialog = new FileDialog(this,"���ϴ�ȭ����");
		
		//���丮����
		fileDialog.setVisible(true);
		
		//������ ���ϰ��(���丮)�� �����̸� ��������
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		//System.out.println(filePath)
		
		//���̺� ���� : �����ӿ� �÷���� ȭ�鿡�� �����ִ�. - add
		Label label = new Label(filePath);
		add(label);
		
		//���ϴ�ȭ���ڸ� ȭ�鿡 ���
		//fileDialog.setVisible(true);
		setVisible(true);
	}
}
