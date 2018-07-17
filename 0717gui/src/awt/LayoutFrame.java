package awt;

import java.awt.*;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		//위치와 크기설정
		setBounds(100,1000,400, 500);
		//제목설정
		setTitle("레이아웃연습");
		
		Panel panel = new Panel();
		
		
		
		
		/*//FlowLayout구현
		//panel의 레이아웃을 설정
		panel.setLayout(new FlowLayout());
		
		Button btn =null; //아래 Button btn방식으로 쓰면, 반복문 실행될때마다 변수가 없어졌다 생성된다
		//컴포넌트배치
		for(int i=0;i<10;i=i+1) {
			btn = new Button("버튼"+i);
			panel.add(btn);
		}*/
		
		
		
		//BorderLayout구현
		/*panel.setLayout(new BorderLayout());
		Button btnWest = new Button("서쪽");
		panel.add("West",btnWest);
		Button btnEast = new Button("동쪽");
		panel.add("East",btnEast);
		Button btnCenter = new Button("중앙");
		panel.add("Center",btnCenter);*/
		
		
		
		//GridLayout구현
		/*panel.setLayout(new GridLayout(2,3,10,10));
		for(int i=0; i<6; i=i+1) {
			Button btn = new Button("버튼"+i);
			panel.add(btn);
		}
		add(panel);
		setResizable(false); //화면크기 조절을 못하도록 설정
		*/
		
		
		
		//null구현 - 위치와 크기를 다 정해줘야한다.
		//└컴포넌트의 크기와 위치를 마음대로 변경할 수있습니다.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10,50,30,50);
		add(label);
		add(panel);
		//화면출력
		setVisible(true);
		
		//null은 좌표설정이 가능하므로 움직이는걸 만들수있다.		
		Thread thread = new Thread() {
			int sign=10;
			
			public void run() {
				//무한반복
				while(true) {
					 //현재레이블의 위치를 가져온다. 
					 int x = label.getLocation().x;
					 int y = label.getLocation().y;
					 //label.setLocation(x+10,y);
					 Random r = new Random();
					 label.setLocation(r.nextInt(300),r.nextInt(300));
					try {						
						Thread.sleep(1000);				 
						 }						 
					 catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
		
		
				
	}
	
	
}
