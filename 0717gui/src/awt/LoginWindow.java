package awt;

import java.awt.*;

public class LoginWindow extends Frame {
	// 생성자 - 인스턴스를 만들때 호출하는 메소드
	public LoginWindow() {
		// 크기와 위치 및 타이틀설정
		setSize(500, 500);
		setLocation(200, 200);
		setTitle("로그인");

		
		// 패널생성
		Panel panel = new Panel();

		
		Label label = new Label("아이디");
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label lblPw = new Label("비밀번호");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		//txtPw.setEchoChar((char)97); - 이렇게도 가능
		panel.add(lblPw);
		panel.add(txtPw);
		
		
		//여러줄 입력할 수 있는 텍스트 영역만들기
		TextArea ta = new TextArea(10,50);
		panel.add(ta);
		

		// 패널을 프레임에 부착
		add(panel);

		
		//메뉴바만들기
		MenuBar menuBar =new MenuBar();
		//메뉴생성
		Menu file = new Menu("파일(F)");
		//메뉴를 메뉴바에 부착
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("새로만들기");
		file.add(newFile);
		MenuItem save = new MenuItem("저장");
		file.add(save);
	
		Menu edit = new Menu("편집");
		MenuItem copy = new MenuItem("복사");
		edit.add(copy);
		file.add(edit);
		
				
		//메뉴바를 윈도우에 배치
		setMenuBar(menuBar);
		
		
		// 화면출력
		setVisible(true);
	}
}
