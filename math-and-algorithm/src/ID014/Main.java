package ID014;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		sc.close();

		long divided = N;
		for (long i = 2; i * i <= N; i++) {
			while (divided % i == 0) {
				System.out.print(i);
				System.out.print(" ");
				divided /= i;
			}
		}

		if (divided >= 2) {
			System.out.println(divided);
		}
	}
}
