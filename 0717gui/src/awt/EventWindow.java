package awt;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class EventWindow extends Frame {
	public EventWindow() {
		// 윈도우의 시작좌표와 크기를 설정
		setBounds(200, 200, 400, 400);
		// 윈도우의 제목설정
		setTitle("이벤트처리");

		
		// 버튼을 생성
		Button btn1 = new Button("버튼1");
		// 여러개의 컴포넌트들을 묶어 줄 패널 생성
		Panel panel = new Panel();
		// 패널에 버튼추가
		panel.add(btn1);
		// 패널을 윈도우에 추가
		add(panel);
		// 윈도우를 화면에 출력
		setVisible(true);

		
		// 버튼을 누를때 이벤트 처리는 ActionListener인터페이스가 처리한다.
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		
		// 버튼과 리스너연결
		// btn1에 ActionEvent가 발생하면 listenr1의 메소드를 호출하도록 설정
		btn1.addActionListener(listener1);

	}
}
