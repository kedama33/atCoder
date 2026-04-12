package ID018;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] aArray = new int[4];
		for (int i = 0; i < N; i++) {
			switch (sc.nextInt()) {
			case 100 -> aArray[0]++;
			case 200 -> aArray[1]++;
			case 300 -> aArray[2]++;
			case 400 -> aArray[3]++;
			}
		}
		sc.close();

		final long ad = aArray[0] * aArray[3];
		final long bc = aArray[1] * aArray[2];
		System.out.println(ad + bc);
	}
}