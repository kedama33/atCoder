package A;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		List<Long> aList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			aList.add(Long.parseLong(sc.next()));
		}

		long sum = 0;
		for (long a : aList) {
			sum += a;
		}

		long oneTenth = sum / 10;

	}
}
