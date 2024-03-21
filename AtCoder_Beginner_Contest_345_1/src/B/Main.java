package B;
// javac B/Main.java

// java B.Main < B/input/test1.txt

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal x = new BigDecimal(sc.next());
		BigDecimal divisor = new BigDecimal(10);
		BigDecimal zero = new BigDecimal(0);
		boolean isMinus = false;

		if (x.compareTo(zero) == 1) {
			isMinus = true;
		}

		System.out.println(
				String.format("%.0f", x.divide(divisor, isMinus ? RoundingMode.UP : RoundingMode.DOWN)));

	}
}
