package ID004;
//cd src

// javac A/Main.java

// java A.Main < A/input/test1.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ans = 1;
		for (int i = 0; i < 3; i++) {
			ans *= sc.nextInt();
		}
		sc.close();

		System.out.println(ans);

	}
}
