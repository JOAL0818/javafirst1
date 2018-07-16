package frame;

import java.awt.*;

public class MyWindow extends Frame {
	// 생성자
	public MyWindow() {
		Dialog dialog = new Dialog(this, "대화상자");
		dialog.setSize(100, 100);

		setBackground(Color.BLUE);
		setSize(200, 200);
		setLocation(100, 100);
		setTitle("나의 첫번째 윈도우 프로그램");

		Panel panel = new Panel();

		Button btn1 = new Button("버튼1");
		// 버튼의 배경색을 변경하는 스레드 - ColorThread로 부터 불러온다.
		// ColorThread th1 = new ColorThread(btn1); //주석처리 후 Annonymous Class구현할거다
		// 이렇게 Annonymous Class구현하면 ColorThread.java는 필요가 없다.
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

		
		
		Button btn2 = new Button("버튼2");
		// 버튼의 텍스트를 변경하는 스레드 - TextThread로부터 불러온다.
		// TextThread th2 = new TextThread(btn2); //주석처리 후 Annonymous Class구현할거다
		// 이렇게 Annonymous Class구현하면 TextThread.java는 필요가 없다.
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

		
		
		// 패널을 프래임에 추가
		add(panel);
		setVisible(true);
	}
}

/*
 * package frame;
 * 
 * import java.awt.*;
 * 
 * public class MyWindow extends Frame { // 생성자 public MyWindow() { Dialog
 * dialog = new Dialog(this, "대화상자"); dialog.setSize(100, 100);
 * 
 * setBackground(Color.BLUE); setSize(200, 200); setLocation(100, 100);
 * setTitle("나의 첫번째 윈도우 프로그램");
 * 
 * 
 * Panel panel = new Panel();
 * 
 * Button button = new Button("버튼"); button.setLabel("버튼의 텍스트변경");
 * button.setBackground(Color.CYAN); button.setForeground(Color.red);
 * 
 * 
 * // add(button); - 이렇게 하면 버튼이 개크니까 panel을 이용해야한다. panel.add(button); // 패널을
 * 프래임에 추가 add(panel);
 * 
 * setVisible(true);
 * 
 * } }
 */
