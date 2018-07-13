package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 인스턴스 배열만들기 - 5개를 저장할 수 있는 배열을 생성
		// 아직은 모두 null
		Song[] songs = new Song[5];
		// 인스턴스 생성
		songs[0] = new Song();
		// 값을 채웁니다.
		songs[0].setTitle("야호");
		songs[0].setSinger("Charlie Puth");
		songs[0].setRelease(20180101);
		songs[0].setRank(3);

		songs[1] = new Song();
		songs[1].setTitle("Suffer");
		songs[1].setSinger("Adele");
		songs[1].setRelease(20180503);
		songs[1].setRank(6);

		songs[2] = new Song();
		songs[2].setTitle("Dessert");
		songs[2].setSinger("Shawn");
		songs[2].setRelease(20181008);
		songs[2].setRank(1);

		songs[3] = new Song();
		songs[3].setTitle("Dangerous");
		songs[3].setSinger("Coldplay");
		songs[3].setRelease(20140523);
		songs[3].setRank(2);

		songs[4] = new Song();
		songs[4].setTitle("Lonely");
		songs[4].setSinger("Sam Smith");
		songs[4].setRelease(20130423);
		songs[4].setRank(10);
		
		
		// cf)숫자면 이전에 했던 것처럼 - 이용하면 된다.
		Scanner sc = new Scanner(System.in);
		while (true) {
			// 비교할 Comparator 변수선언
			Comparator<Song> comparator = null;
			System.out.print("0:종료 1:제목오름차순 2.제목내림차순");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Song first = (Song) o1;
						Song second = (Song) o2;
						return first.getTitle().compareTo(second.getTitle());
					}

				};
			}

			else if (menu == 2) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Song first = (Song) o1;
						Song second = (Song) o2;
						return second.getTitle().compareTo(first.getTitle());
					}

				};
			}
			Arrays.sort(songs, comparator);
			for (Song song : songs) {
				System.out.println(song);
			}

		}
	}
}

/*
 * package arrays;
 * 
 * import java.lang.reflect.Array; import java.util.Arrays; import
 * java.util.Comparator;
 * 
 * public class Main2 {
 * 
 * public static void main(String[] args) { //인스턴스 배열만들기 - 5개를 저장할 수 있는 배열을 생성
 * //아직은 모두 null Song [] songs =new Song[5]; //인스턴스 생성 songs[0]=new Song(); //값을
 * 채웁니다. songs[0].setTitle("야호"); songs[0].setSinger("Charlie Puth");
 * songs[0].setRelease(20180101); songs[0].setRank(3);
 * 
 * songs[1]=new Song(); songs[1].setTitle("Suffer");
 * songs[1].setSinger("Adele"); songs[1].setRelease(20180503);
 * songs[1].setRank(6);
 * 
 * songs[2]=new Song(); songs[2].setTitle("Dessert");
 * songs[2].setSinger("Shawn"); songs[2].setRelease(20181008);
 * songs[2].setRank(1);
 * 
 * songs[3]=new Song(); songs[3].setTitle("Dangerous");
 * songs[3].setSinger("Coldplay"); songs[3].setRelease(20140523);
 * songs[3].setRank(2);
 * 
 * songs[4]=new Song(); songs[4].setTitle("Lonely");
 * songs[4].setSinger("Sam Smith"); songs[4].setRelease(20130423);
 * songs[4].setRank(10);
 * 
 * 
 * //배열의 데이터 전부 출력 - 입력한 순서대로 출력이된다. for(Song song : songs) {
 * System.out.println(song); }
 * 
 * //Comparator 인터페이스를 implements한 인스턴스 만들기 - Comparator인터페이스에 있는 compare메소드로
 * 크기비교해라 Comparator <Song> comparator = new Comparator() {
 * 
 * @Override public int compare(Object o1, Object o2) { Song first = (Song)o1;
 * Song second = (Song)o2; //title을 이용해서 비교 return
 * first.getTitle().compareTo(second.getTitle()); }
 * 
 * };
 * 
 * Arrays.sort(songs, comparator); //배열의 데이터 전부 출력 - 입력한 순서대로 출력이된다. for(Song
 * song : songs) { System.out.println(song); }
 * 
 * }
 */

/*
 * package arrays;
 * 
 * import java.lang.reflect.Array; import java.util.Arrays;
 * 
 * public class Main2 {
 * 
 * public static void main(String[] args) { //인스턴스 배열만들기 - 5개를 저장할 수 있는 배열을 생성
 * //아직은 모두 null Song [] songs =new Song[5]; //인스턴스 생성 songs[0]=new Song(); //값을
 * 채웁니다. songs[0].setTitle("야호"); songs[0].setSinger("Charlie Puth");
 * songs[0].setRelease(20180101); songs[0].setRank(3);
 * 
 * songs[1]=new Song(); songs[1].setTitle("Suffer");
 * songs[1].setSinger("Adele"); songs[1].setRelease(20180503);
 * songs[1].setRank(6);
 * 
 * songs[2]=new Song(); songs[2].setTitle("Dessert");
 * songs[2].setSinger("Shawn"); songs[2].setRelease(20181008);
 * songs[2].setRank(1);
 * 
 * songs[3]=new Song(); songs[3].setTitle("Dangerous");
 * songs[3].setSinger("Coldplay"); songs[3].setRelease(20140523);
 * songs[3].setRank(2);
 * 
 * songs[4]=new Song(); songs[4].setTitle("Lonely");
 * songs[4].setSinger("Sam Smith"); songs[4].setRelease(20130423);
 * songs[4].setRank(10);
 * 
 * 
 * //배열의 데이터 전부 출력 - 입력한 순서대로 출력이된다. for(Song song : songs) {
 * System.out.println(song); }
 * 
 * System.out.println(""); //배열의 테이터를 정렬 //예외발생 -> 기본적으로 정렬을 하려면 각 테이터의 크기를 비교할
 * 수 있어야한다. // └ 자바에서 크기비교를 하는 메소드는 Comparable인터페이스의 compare메소드입니다. //따라서, 직접만든
 * 클래스의 경우는 클래스에 Comparable 인터페이스를 implements 하던가 (->하고 나서 오버라이딩) //
 * Comparator인터페이스를 implements한 인스턴스를 같이 대입해야한다. Arrays.sort(songs); for(Song
 * song : songs) { System.out.println(song); }
 * 
 * 
 * }
 * 
 * }
 */
