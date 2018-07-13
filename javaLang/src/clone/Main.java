package clone;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNum(1);
		user1.setName("아이린");
		String[]hobbies= {"랩","춤"};
		user1.setHobbies(hobbies);
		System.out.println(user1);
		
		User user2 = user1;
		user2.setNum(2);
		user2.setName("슬기");
		System.out.println(user1);
		
		User user3 = user1.clone();
		user3.setNum(3);
		user3.setName("조이");
		user3.getHobbies()[0]="연기";
		System.out.println(user3);
		
	}

}
