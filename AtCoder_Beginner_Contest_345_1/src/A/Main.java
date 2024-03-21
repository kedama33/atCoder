package A;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] sArray = sc.nextLine().split("");

		if (sArray[0].equals("<") && sArray[sArray.length - 1].equals(">")) {
			boolean isEqualOnly = true;
			for (int i = 1; i < sArray.length - 1; i++) {
				if (!sArray[i].equals("=")) {
					isEqualOnly = false;
					break;
				}
			}

			if (isEqualOnly) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} else {
			System.out.println("No");
		}

	}
}
