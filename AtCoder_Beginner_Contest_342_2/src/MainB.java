// javac ./MainB.java
// java MainB < ../input/test.txt

import java.util.*;

public class MainB {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		String str = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append(str);

		System.out.println(sb.toString());

	}
}
