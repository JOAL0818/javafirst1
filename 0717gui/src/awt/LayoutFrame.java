package awt;

import java.awt.*;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		//��ġ�� ũ�⼳��
		setBounds(100,1000,400, 500);
		//������
		setTitle("���̾ƿ�����");
		
		Panel panel = new Panel();
		
		
		
		
		/*//FlowLayout����
		//panel�� ���̾ƿ��� ����
		panel.setLayout(new FlowLayout());
		
		Button btn =null; //�Ʒ� Button btn������� ����, �ݺ��� ����ɶ����� ������ �������� �����ȴ�
		//������Ʈ��ġ
		for(int i=0;i<10;i=i+1) {
			btn = new Button("��ư"+i);
			panel.add(btn);
		}*/
		
		
		
		//BorderLayout����
		/*panel.setLayout(new BorderLayout());
		Button btnWest = new Button("����");
		panel.add("West",btnWest);
		Button btnEast = new Button("����");
		panel.add("East",btnEast);
		Button btnCenter = new Button("�߾�");
		panel.add("Center",btnCenter);*/
		
		
		
		//GridLayout����
		/*panel.setLayout(new GridLayout(2,3,10,10));
		for(int i=0; i<6; i=i+1) {
			Button btn = new Button("��ư"+i);
			panel.add(btn);
		}
		add(panel);
		setResizable(false); //ȭ��ũ�� ������ ���ϵ��� ����
		*/
		
		
		
		//null���� - ��ġ�� ũ�⸦ �� ��������Ѵ�.
		//��������Ʈ�� ũ��� ��ġ�� ������� ������ ���ֽ��ϴ�.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10,50,30,50);
		add(label);
		add(panel);
		//ȭ�����
		setVisible(true);
		
		//null�� ��ǥ������ �����ϹǷ� �����̴°� ������ִ�.		
		Thread thread = new Thread() {
			int sign=10;
			
			public void run() {
				//���ѹݺ�
				while(true) {
					 //���緹�̺��� ��ġ�� �����´�. 
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
