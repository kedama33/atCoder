package ID009;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int S = sc.nextInt();
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		boolean[][] dp = new boolean[N + 1][S + 1];
		dp[0][0] = true;

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= S; j++) {
				if (j < A[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					if (dp[i - 1][j] == true || dp[i - 1][j - A[i]] == true) {
						dp[i][j] = true;
					}
				}
			}
		}

		System.out.println(dp[N][S] == true ? "Yes" : "No");
	}
}
