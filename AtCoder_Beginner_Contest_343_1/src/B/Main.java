package B;
// javac ./Main.java

// java B/Main < input/test.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int a = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a = Integer.parseInt(sc.next());
				if (a == 1) {
					System.out.print(j + 1);
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
