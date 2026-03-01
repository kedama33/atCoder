package ID003;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += sc.nextInt();
		}

		sc.close();

		System.out.println(ans);
	}
}
