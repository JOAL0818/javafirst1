package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealEventRouting extends Frame {
	public RealEventRouting() {
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
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
				switch(e.getActionCommand()) {
				case "한국어":
					label.setText("안녕하세요");
					break;
				case "영어":
					label.setText("Hello");
					break;
				case "종료":
					System.exit(0);
					break;
				
				}
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);

		// 윈도우를 화면에 출력
		setVisible(true);
	}
}
