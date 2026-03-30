package ID016;
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

		long B = aArray[0];
		for (int i = 1; i < N; i++) {
			long C = aArray[i];
			while (B > 0 && C > 0) {
				if (B < C) {
					C = C % B;
				} else {
					B = B % C;
				}
			}
			B = Math.max(B, C);
		}

		System.out.println(B);
	}
}
