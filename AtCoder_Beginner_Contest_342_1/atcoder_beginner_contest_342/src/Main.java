// javac ./Main.java
// java Main < ../input/test.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String str = sc.next();

		int q = sc.nextInt();

		String c = "";
		String d = "";

		String replaceFrom = "abcdefghijklmnopqrstuvwxyz";
		String replaceTo = "abcdefghijklmnopqrstuvwxyz";

		int strNum = -1;

		for (int i = 0; i < q; i++) {
			c = sc.next();
			d = sc.next();

			strNum = replaceTo.indexOf(c);
			if (strNum != -1) {
				replaceTo = replaceTo.replace(c, d);
			}
		}

		int replaceToNum = -1;

		StringBuilder sb = new StringBuilder();
		sb.append(str);

		for (int i = 0; i < n; i++) {
			replaceToNum = replaceFrom.indexOf(str.charAt(i));
			sb.replace(i, i + 1, String.valueOf(replaceTo.charAt(replaceToNum)));
		}

		System.out.println(sb.toString());

	}
}
