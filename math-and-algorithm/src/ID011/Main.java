package ID011;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for (int i = 2; i <= N; i++) {
			if (isPrime(i)) {
				sb.append(i);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

	static boolean isPrime(final int target) {
		for (int i = 2; i * i <= target; i++) {
			if (target % i == 0) {
				return false;
			}
		}

		return true;
	}
}
