package clause_final_problem_2_3;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		System.out.println("問題2.3.1");
		int[] argArray = { 1, 5, 10 };
		for (int arg : argArray) {
			cube(arg);
		}

		System.out.println("問題2.3.2");
		System.out.println("1. 3");
		System.out.println("2. " + Math.pow(100, 1.5));
		System.out.println("3. 20, 21");

		System.out.println("問題2.3.3はdesmos.comにて実施した");

		System.out.println("問題2.3.4");
		System.out.println("1. " + Math.pow(2, 20));
		System.out.println(
				"2. 2^20は指数法則から2^10^2である。2^10は1000と近いことから、2^10^2である2^20は1000 * 1000 = 10^3 * 10^3 = 10^6 と近いということができる。");

		System.out.println("問題2.3.5");
		System.out.println("1. " + Math.log10(1000000));
		System.out.println("2. log_2(16N) - log_2(N) = log_2(16N / N) = log_2(16) = 4");

		System.out.println("問題2.3.6");
		System.out.println("1. " + calcEnergyMultiplier(6.0, 5.0));
		System.out.println("2. " + calcEnergyMultiplier(7.3, 5.3));
		System.out.println("3. " + calcEnergyMultiplier(9.0, 7.2));

		System.out.println("問題2.3.7");
		System.out.println("y = log_2(x)");

		System.out.println("問題2.3.8");
		System.out.println("");
	}

	private static void cube(final int num) {
		System.out.println(num * num * num);
	}

	private static int calcEnergyMultiplier(final double minuend, final double subtrahend) {
		return (int) Math.pow(32, minuend - subtrahend);
	}
}
