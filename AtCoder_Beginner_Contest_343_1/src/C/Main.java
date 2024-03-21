package C;
// javac C/Main.java

// java C.Main < C/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());

		StringBuilder sb = new StringBuilder();
		String str = "";
		String answer = "";

		for (long i = 1; i * i * i <= n; i++) {
			str = String.valueOf(i * i * i);
			sb.append(str);
			sb.reverse();
			if (sb.toString().equals(str)) {
				answer = str;
			}
			sb.setLength(0);
		}

		System.out.println(answer);
	}
}