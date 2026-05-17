package ID031;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long[] A = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		long[] study = new long[N + 1];
		long[] rest = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			study[i] = rest[i - 1] + A[i];
			rest[i] = Math.max(study[i - 1], rest[i - 1]);
		}

		System.out.println(Math.max(study[N], rest[N]));
	}
}
