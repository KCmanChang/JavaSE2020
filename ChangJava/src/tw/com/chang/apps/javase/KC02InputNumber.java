package tw.com.chang.apps.javase;

import java.util.Scanner;

public class KC02InputNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		// System.out.println(x);
		int y = scanner.nextInt();
		int plus = x + y;
		int minus = x - y;
		int mult = x * y;
		int divis = x / y;
		int mod = x % y;
		//System.out.println(result);
		System.out.printf("%d + %d = %d\n", x, y, plus);
		System.out.printf("%d - %d = %d\n", x, y, minus);
		System.out.printf("%d x %d = %d\n", x, y, mult);
		System.out.printf("%d / %d = %d ...... %d\n", x, y, divis, mod);
	}

}
