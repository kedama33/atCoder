package clause_final_problem_3_5;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		final int N = 1000000;
		int M = 0;
		for (int i = 0; i < N; i++) {
			double px = Math.random() * 6;
			double py = Math.random() * 9;

			double dist33 = Math.sqrt((px - 3.0) * (px - 3.0) + (py - 3.0) * (py - 3.0));
			double dist37 = Math.sqrt((px - 3.0) * (px - 3.0) + (py - 7.0) * (py - 7.0));

			if (dist33 <= 3 || dist37 <= 2) {
				M++;
			}
		}

		System.out.println(M);
	}
}
