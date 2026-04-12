package ID019;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int countRed = 0;
		int countYellow = 0;
		int countBlue = 0;
		for (int i = 0; i < N; i++) {
			switch (sc.nextInt()) {
			case 1 -> countRed++;
			case 2 -> countYellow++;
			case 3 -> countBlue++;
			}
		}
		sc.close();

		System.out.println(nC2(countRed) + nC2(countYellow) + nC2(countBlue));
	}

	public static long nC2(final long n) {
		return (long) n * (n - 1) / 2;
	}
}
