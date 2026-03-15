package ID008;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int S = sc.nextInt();
		sc.close();

		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i + j <= S) {
					count++;
				} else {
					break;
				}
			}
		}

		System.out.println(count);
	}
}
