package ID025;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		final double expectedValueOfA = sumExpectedValue(N, sc, 6, 2);
		final double expectedValueOfB = sumExpectedValue(N, sc, 6, 4);

		sc.close();

		System.out.println(expectedValueOfA + expectedValueOfB);
	}

	private static double calcExpectedValue(Scanner sc, final int population, final int children) {
		final double current = sc.nextDouble();
		return current * children / population;
	}

	private static double sumExpectedValue(final int N, Scanner sc, final int population, final int children) {
		double sum = 0;

		for (int i = 0; i < N; i++) {
			sum += calcExpectedValue(sc, population, children);
		}

		return sum;
	}
}
