package arrays;

public class Song{
	  				
	//저장하고자하는 항목
	private String title;
	private String singer;
	private int release;
	private int rank;
	
	
	//접근자메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int i) {
		this.release = i;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int i) {
		this.rank = i;
	}
	
	//입력된 데이터를 빠르게 확인하기 위한 toString
	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", release=" + release + ", rank=" + rank + "]";
	}
			
}



/*package arrays;

public class Song implements Comparable{  
	  				//implements Comparable하고 에러없에려면 인터페이스에 있는 메소드는 추상메소드라 반드시오버라이딩을 헤줘야한다.
	//저장하고자하는 항목
	private String title;
	private String singer;
	private int release;
	private int rank;
	
	
	//접근자메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int i) {
		this.release = i;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int i) {
		this.rank = i;
	}
	
	//입력된 데이터를 빠르게 확인하기 위한 toString
	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", release=" + release + ", rank=" + rank + "]";
	}
	
	//크기비교를 하는 메소드1)-1.오름차순
//	@Override   
//	public int compareTo(Object o) {
//		Song other = (Song)o;
//		if(this.rank>other.rank) {			
//			return 1;
//		}
//		else if(this.rank==other.rank) {	
//			return 0;
//		}
//		else {
//			return -1;
//		}
//	}
	
	//크기비교메소드1)-2.위의 오름차순을 한줄로 줄이면 
//	@Override
//	public int compareTo(Object o) {
//		Song other =(Song)o;
//		return this.rank-other.rank;
//	}
	
	//크기비교메소드2)내림차순
//	@Override
//	public int compareTo(Object o) {
//		Song other =(Song)o;
//		return (this.rank-other.rank)*-1; //-1을 곱하던가 순서 바꿔서 빼던가  
//		//return other.rank-this.rank  
//	}
	
	
	//크기비교메소드 3)문자열 정렬
	@Override
	public int compareTo(Object o) {
		Song other = (Song)o;
		return this.title.compareTo(other.title);
	}
			
}*/
