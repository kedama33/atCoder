package ID026;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();

		double ans = 0;
		for (int i = N; i >= 1; i--) {
			ans += 1.0 * N / i;
		}

		System.out.println(ans);
	}
}
