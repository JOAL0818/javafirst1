package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	//생성자 - 인스턴스를 생성할때 호출하는 메소드
	public CommonsDialog() {
		//앞-위치, 뒤-크기 동시설정
		setBounds(200,200,600,600);
		//제목설정
		setTitle("공통대화상자");
		
		//-----파일대화상자만들기 
		//FileDialog 객체를 생성해서 화면에 출력하고 선택한 파일경로를 레이블에 출력
		//└객체 생성시, 첫번째 매개변수는 Dialog나 Frame의 주소인데 지금의 경우는 this를 대입하면 된다. **가장중요- dialog에서 parent설정하기
		
		//FileDialog 인스턴스생성
		FileDialog fileDialog = new FileDialog(this,"파일대화상자");
		
		//디렉토리설정
		fileDialog.setVisible(true);
		
		//선택한 파일경로(디렉토리)와 파일이름 가져오기
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		//System.out.println(filePath)
		
		//레이블 생성 : 프레임에 올려줘야 화면에서 볼수있다. - add
		Label label = new Label(filePath);
		add(label);
		
		//파일대화상자를 화면에 출력
		//fileDialog.setVisible(true);
		setVisible(true);
	}
}
