import java.util.Scanner;

public class CharacterLength {

    public static void main(String[] args) {
        System.out.print("Enter the input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        while(i < input.length()) {
        	char ch = input.charAt(i);
        	i++;
        	int num = 0;
        	while(i < input.length() && Character.isDigit(input.charAt(i))) {
        		num = num * 10 + (input.charAt(i) - '0');
        		i++;
        	}
        	
        	for(int j = 0 ; j < num; j++) {
        		System.out.print(ch);
        	}
        }
        System.out.println();
        scanner.close();
    }
}
