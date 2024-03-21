package D;
// javac D/Main.java

// java D.Main < input/test.txt

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());

		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			a.add(Integer.parseInt(sc.next()));
			b.add(Integer.parseInt(sc.next()));
		}

		String str = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append(str);

		System.out.println(sb.toString());

	}
}
