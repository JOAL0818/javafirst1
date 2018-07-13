package clone;

import java.util.Arrays;

public class User {
	private int num;
	private String name;
	private String [] hobbies;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
	
	public User clone() {
		User user = new User();
		user.num=this.num;
		user.name=this.name;
		user.hobbies=this.hobbies;
		
		return user;
		
	}
	
	
	

}
