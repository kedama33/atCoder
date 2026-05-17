package ID033;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final long ax = sc.nextLong();
		final long ay = sc.nextLong();
		final long bx = sc.nextLong();
		final long by = sc.nextLong();
		final long cx = sc.nextLong();
		final long cy = sc.nextLong();
		sc.close();

		final long BAx = ax - bx;
		final long BAy = ay - by;
		final long BCx = cx - bx;
		final long BCy = cy - by;
		final long CAx = ax - cx;
		final long CAy = ay - cy;
		final long CBx = bx - cx;
		final long CBy = by - cy;

		int pattern = 2;
		if (BAx * BCx + BAy * BCy < 0) {
			pattern = 1;
		} else if (CAx * CBx + CAy * CBy < 0) {
			pattern = 3;
		}

		double ans = 0.0;
		switch (pattern) {
			case 1 -> ans = Math.sqrt(BAx * BAx + BAy * BAy);
			case 2 -> {
				double S = Math.abs(BAx * BCy - BAy * BCx);
				double BCLen = Math.sqrt(BCx * BCx + BCy * BCy);
				ans = S / BCLen;
			}
			case 3 -> ans = Math.sqrt(CAx * CAx + CAy * CAy);
		}

		System.out.printf("%.12f\n", ans);
	}
}
