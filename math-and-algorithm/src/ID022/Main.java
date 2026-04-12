package ID022;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long[] array = new long[100000];
		for (int i = 0; i < N; i++) {
			array[sc.nextInt()]++;
		}
		sc.close();

		long count = 0;
		for (int i = 1; i < 50000; i++) {
			count += array[i] * array[100000 - i];
		}

		count += array[50000] * (array[50000] - 1) / 2;

		System.out.println(count);
	}
}
