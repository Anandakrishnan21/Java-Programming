import java.util.ArrayList;

public class PrgArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Apple");
		list1 .add("orange");
		list2.add("Apple");
		list2.add("orange");
		list1.addAll(list2);
		System.out.print(list1);
	}
}
