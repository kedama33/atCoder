package ID010;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();

		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans = ans * i;
		}

		System.out.println(ans);
	}
}