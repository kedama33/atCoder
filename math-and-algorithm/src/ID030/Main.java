package ID030;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int W = sc.nextInt();
		int[] w = new int[N + 1];
		long[] v = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
		sc.close();

		long[][] dp = new long[N + 1][W + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j < w[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				}
			}
		}

		long ans = 0;
		for (int i = 0; i <= W; i++) {
			ans = Math.max(ans, dp[N][i]);
		}

		System.out.println(ans);
	}
}
