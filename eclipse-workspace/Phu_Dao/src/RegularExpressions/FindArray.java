package RegularExpressions;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindArray {
	public static void main(String[] args) {
		// String pattern = "(\\A)(\\d)";
		int[] arrayNumber = new int[100];

		Pattern r;
		Matcher m;

		for (int i = 0; i < 100; i++) {
			Random nb = new Random();
			arrayNumber[i] = nb.nextInt(100);
		}

		System.out.println("- Mảng Random: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(arrayNumber[i] + "	");
			if ((i % 10 == 0) && (i != 0)) {
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("- Các số >50: ");
		// for(int i = 0; i < 100; i++) {
		// String pattern = "(\\A)(\\d)";
		// r = Pattern.compile(pattern);
		// m = r.matcher(String.valueOf(arrayNumber[i]));
		//
		// if(m.find()) {
		// if((m.group()).equals("2")) {
		// System.out.print(arrayNumber[i] + " ");
		// }
		// } else {
		// System.out.println("NO MATCH");
		// }
		// }
		// System.out.println();

		System.out.println("- Các số bắt đầu = 2: ");
		for (int i : arrayNumber) {
			String pattern = "(\\d)";
			r = Pattern.compile(pattern);
			m = r.matcher(String.valueOf(i));
			
//			if (m.find()) {
//				System.out.println(m.group());
//			}
			if (m.find()) {
				if (m.group().equals("2")) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("NO MATCH");
			}
		}
		System.out.println();

		System.out.println("- Các số có chứa số 2: ");
		for (int i : arrayNumber) {
			String pattern = "(\\A)(\\Z)";
			r = Pattern.compile(pattern);
			m = r.matcher(String.valueOf(i));

			if (m.find()) {
				if (m.group().equals("2")) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("NO MATCH");
			}
		}
	}
}
