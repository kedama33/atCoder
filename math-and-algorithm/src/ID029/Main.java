package ID029;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();

		long[] dp = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			if (i == 0) {
				dp[0] = 1;
			}

			if (i == 1) {
				dp[1] = 1;
			}

			if (i >= 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
		}

		System.out.println(dp[N]);
	}
}
