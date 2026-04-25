package ID023;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		final double expectedValueOfB = calcExpectedValue(N, sc);
		final double expectedValueOfR = calcExpectedValue(N, sc);

		System.out.println(expectedValueOfB + expectedValueOfR);
	}

	private static double calcExpectedValue(final int N, Scanner sc) {
		double returnValue = 0.0;

		for (int i = 0; i < N; i++) {
			returnValue += sc.nextDouble() / N;
		}

		return returnValue;
	}
}
