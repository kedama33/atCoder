package ID017;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long[] aArray = new long[N];
		for (int i = 0; i < N; i++) {
			aArray[i] = sc.nextLong();
		}
		sc.close();

		long lcm = aArray[0];
		for (int i = 1; i < N; i++) {
			long gcd = calcGCD(lcm, aArray[i]);
			lcm = lcm / gcd * aArray[i];
		}

		System.out.println(lcm);
	}

	static long calcGCD(long num1, long num2) {
		while (num1 > 0 && num2 > 0) {
			if (num1 < num2) {
				num2 %= num1;
			} else {
				num1 %= num2;
			}
		}

		return Math.max(num1, num2);
	}
}