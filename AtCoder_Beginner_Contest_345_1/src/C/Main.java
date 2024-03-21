package C;
// javac C/Main.java

// java C.Main < C/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long n = s.length();

		int[] arr = new int[26];

		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}

		boolean flag = false;
		long count = 0;

		for (int i = 0; i < n; i++) {
			count += n - arr[s.charAt(i) - 'a'];
			if (arr[s.charAt(i) - 'a'] > 1) {
				flag = true;
			}
		}

		count /= 2;

		if (flag) {
			count++;
		}

		System.out.println(count);
	}
}
