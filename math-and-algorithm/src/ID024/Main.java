package ID024;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		double ans = 0;
		for (int i = 0; i < N; i++) {
			ans += calcExpectedValue(sc);
		}

		System.out.println(ans);
	}

	private static double calcExpectedValue(Scanner sc) {
		final double P = sc.nextDouble();
		final double Q = sc.nextDouble();

		return Q / P;
	}
}
