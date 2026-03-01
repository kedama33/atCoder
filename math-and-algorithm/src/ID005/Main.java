package ID005;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		int a = 0;
		for (int i = 0; i < N; i++) {
			a += sc.nextInt();
		}

		sc.close();

		System.out.println(a % 100);

	}
}
