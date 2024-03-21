package A;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String[] sSplit = s.split("\\|");

		StringBuilder sb = new StringBuilder();

		if (sSplit.length >= 1) {
			sb.append(sSplit[0]);
		}

		if (sSplit.length == 3) {
			sb.append(sSplit[2]);
		}

		System.out.println(sb.toString());

	}
}
