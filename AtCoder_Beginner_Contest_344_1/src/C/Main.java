package C;
// javac C/Main.java

// java C.Main < C/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] aArray = readArray(sc, n);

		int m = Integer.parseInt(sc.next());
		int[] bArray = readArray(sc, m);

		int l = Integer.parseInt(sc.next());
		int[] cArray = readArray(sc, l);

		int q = Integer.parseInt(sc.next());
		int[] xArray = readArray(sc, q);

		Set<Integer> sumAB = new HashSet<Integer>();
		for (int a : aArray) {
			for (int b : bArray) {
				sumAB.add(a + b);
			}
		}

		for (int i = 0; i < q; i++) {
			boolean isContain = false;

			for (int c : cArray) {
				if (sumAB.contains(xArray[i] - c)) {
					isContain = true;
				}
			}

			System.out.println(isContain ? "Yes" : "No");
		}

	}

	public static int[] readArray(Scanner sc, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(sc.next());
		}
		return array;
	}
}
