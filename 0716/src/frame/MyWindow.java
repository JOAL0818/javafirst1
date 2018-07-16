package frame;

import java.awt.*;

public class MyWindow extends Frame {
	// ������
	public MyWindow() {
		Dialog dialog = new Dialog(this, "��ȭ����");
		dialog.setSize(100, 100);

		setBackground(Color.BLUE);
		setSize(200, 200);
		setLocation(100, 100);
		setTitle("���� ù��° ������ ���α׷�");

		Panel panel = new Panel();

		Button btn1 = new Button("��ư1");
		// ��ư�� ������ �����ϴ� ������ - ColorThread�� ���� �ҷ��´�.
		// ColorThread th1 = new ColorThread(btn1); //�ּ�ó�� �� Annonymous Class�����ҰŴ�
		// �̷��� Annonymous Class�����ϸ� ColorThread.java�� �ʿ䰡 ����.
		// -----------------------------------------------------------------------------
		Thread th1 = new Thread() {
			public void run() {
				Color[] colors = { Color.red, Color.blue, Color.green };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						btn1.setBackground(colors[idx % colors.length]);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		// -----------------------------------------------------------------------------
		th1.start();
		panel.add(btn1);

		
		
		Button btn2 = new Button("��ư2");
		// ��ư�� �ؽ�Ʈ�� �����ϴ� ������ - TextThread�κ��� �ҷ��´�.
		// TextThread th2 = new TextThread(btn2); //�ּ�ó�� �� Annonymous Class�����ҰŴ�
		// �̷��� Annonymous Class�����ϸ� TextThread.java�� �ʿ䰡 ����.
		// -----------------------------------------------------------------------------
		Thread th2 = new Thread() {
			public void run() {
				String[] ar = { "Java", "Oracle", "FrontEnd", "BackEnd", "Android", "iOS" };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						btn2.setLabel(ar[idx % ar.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		// -----------------------------------------------------------------------------
		th2.start();
		panel.add(btn2);

		
		
		// �г��� �����ӿ� �߰�
		add(panel);
		setVisible(true);
	}
}

/*
 * package frame;
 * 
 * import java.awt.*;
 * 
 * public class MyWindow extends Frame { // ������ public MyWindow() { Dialog
 * dialog = new Dialog(this, "��ȭ����"); dialog.setSize(100, 100);
 * 
 * setBackground(Color.BLUE); setSize(200, 200); setLocation(100, 100);
 * setTitle("���� ù��° ������ ���α׷�");
 * 
 * 
 * Panel panel = new Panel();
 * 
 * Button button = new Button("��ư"); button.setLabel("��ư�� �ؽ�Ʈ����");
 * button.setBackground(Color.CYAN); button.setForeground(Color.red);
 * 
 * 
 * // add(button); - �̷��� �ϸ� ��ư�� ��ũ�ϱ� panel�� �̿��ؾ��Ѵ�. panel.add(button); // �г���
 * �����ӿ� �߰� add(panel);
 * 
 * setVisible(true);
 * 
 * } }
 */
