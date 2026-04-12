package ID020;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] aArray = new int[N];
		for (int i = 0; i < N; i++) {
			aArray[i] = sc.nextInt();
		}

		long count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					for (int l = k + 1; l < N; l++) {
						for (int m = l + 1; m < N; m++) {
							if (aArray[i] + aArray[j] + aArray[k] + aArray[l] + aArray[m] == 1000) {
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}
