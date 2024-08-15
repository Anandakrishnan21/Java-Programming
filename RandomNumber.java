import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		String alphabets = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		Random rand = new Random();
		String phone = "";
		String email = "";
		
		for(int i=0; i<10; i++) {
			int num = rand.nextInt(10);
			char str = alphabets.charAt(num);
			phone += num;
			email += str;
		}
		
		System.out.println("Random Phone Number:" + phone);
		System.out.print("Random Email:" + email + "gmail.com");	
	}

}
