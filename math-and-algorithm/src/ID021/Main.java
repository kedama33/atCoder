package ID021;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final int r = sc.nextInt();
		sc.close();

		System.out.println(nCr(n, r));

	}

	public static long nCr(final int n, final int r) {
		long child = calc(n, r);
		long parameter = calc(r, r);
		return child / parameter;
	}

	public static long calc(final int startNum, final int loopNum) {
		long res = 1;
		for (int i = 0; i < loopNum; i++) {
			res *= startNum - i;
		}

		return res;
	}
}
