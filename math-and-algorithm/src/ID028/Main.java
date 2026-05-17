package ID028;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] h = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int[] dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				dp[i] = 0;
			}

			if (i == 2) {
				dp[i] = Math.abs(h[1] - h[2]);
			}

			if (i >= 3) {
				int b1 = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
				int b2 = dp[i - 2] + Math.abs(h[i - 2] - h[i]);
				dp[i] = Math.min(b1, b2);
			}
		}

		System.out.println(dp[N]);
	}
}
