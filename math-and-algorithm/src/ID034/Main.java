package ID034;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		double[] x = new double[N + 1];
		double[] y = new double[N + 1];
		for (int i = 1; i <= N; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		sc.close();

		double minDistance = Double.MAX_VALUE;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j) {
					continue;
				}

				final double xij = x[i] - x[j];
				final double yij = y[i] - y[j];
				final double ijDistance = Math.sqrt(xij * xij + yij * yij);

				if (ijDistance < minDistance) {
					minDistance = ijDistance;
				}
			}
		}

		System.out.printf("%.12f\n", minDistance);
	}
}
