package clone;

public class MainPractice {

	public static void main(String[] args) {
		
		//value형 데이터 복사
		int n =10;
		int x=n;
		x=20;
		System.out.println(n);
			 
		//reference형1) - 주소복사
		int[]ar={10,20,30};
		int[]br=ar;
		br[0]=100;
		System.out.println(ar[0]);
		
		//reference형2) - 데이터 복사
		int[]cr= new int[ar.length];
		for(int i=0;i<ar.length;i=i+1) {
			cr[i]=ar[i];
		}
		cr[0]=300;
		System.out.println(ar[0]);
		 
		 
	}
}		