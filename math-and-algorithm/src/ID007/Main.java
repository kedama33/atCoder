package ID007;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		sc.close();

		final int countMultiplesOfX = N / X;
		final int countMultiplesOfY = N / Y;
		final int gcdXY = gcd(X, Y);
		final int lcm = X * Y / gcdXY;
		final int countMultiplesOfXY = N / lcm;

		System.out.println(countMultiplesOfX + countMultiplesOfY - countMultiplesOfXY);

	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
}
