package B;
// javac B/Main.java

// java B.Main < B/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> intList = new ArrayList<Integer>();

		String str = "";

		while (!str.equals("0")) {
			str = sc.next();
			intList.add(Integer.parseInt(str));
		}

		for (int i = intList.size() - 1; i >= 0; i--) {
			System.out.println(intList.get(i));
		}
	}
}
