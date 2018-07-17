package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		// 윈도우의 시작좌표와 크기를 설정
		setBounds(200, 200, 400, 400);
		// 윈도우의 제목설정
		setTitle("이벤트라우팅");

		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label();

		Panel centerPanel = new Panel();
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		add("Center", centerPanel);

		add("South", label);

		// ActionEvent를 처리할 수 있는 인스턴스만들기
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("안녕하세요");

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

		// 윈도우를 화면에 출력
		setVisible(true);
	}
}
