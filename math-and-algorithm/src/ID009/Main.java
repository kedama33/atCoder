package ID009;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int S = sc.nextInt();
		int[] aArray = new int[N];
		for (int i = 0; i < N; i++) {
			aArray[i] = sc.nextInt();
		}
		sc.close();

		for (int bit = 0; bit < (1 << N); bit++) {

			int sum = 0;

			for (int i = 0; i < N; i++) {
				if ((bit & (1 << i)) != 0) {
					sum += aArray[i];
				}
			}
			if (sum == S) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}
