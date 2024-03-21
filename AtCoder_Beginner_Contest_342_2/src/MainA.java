// javac ./MainA.java
// java MainA < ../input/test.txt

import java.util.*;

public class MainA {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] strList = str.split("");

		String majority;

		if (strList[0].equals(strList[1])) {
			majority = strList[0];
		} else if (strList[1].equals(strList[2])) {
			majority = strList[1];
		} else {
			majority = strList[0];
		}

		int n = 1;

		for (int i = 0; i < strList.length; i++) {
			if (!strList[i].equals(majority)) {
				n = i + 1;
				System.out.println(n);
				break;
			}
		}
	}
}
