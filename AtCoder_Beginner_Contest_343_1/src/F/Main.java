package F;
// javac ./MainA.java

// java MainA < ../input/test.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		String str = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append(str);

		System.out.println(sb.toString());

	}
}
