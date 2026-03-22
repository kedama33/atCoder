package clause_final_problem_3_1_1;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		final int N = 30;
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				System.out.println("30は素数ではありません");
				return;
			}
		}

		System.out.println("30は素数です");

	}
}
