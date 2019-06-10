package demo_java;

import java.util.Scanner;

public class DaySNT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n:");
		int n = sc.nextInt();
		boolean sNT;
		System.out.println("Ta có dãy n SNT là:");
		for (int i = 2; i <= n; i++) {
			sNT = true;
			if (i == 2) {
				sNT = true;
			} else {
				for (int j = 2; j < Math.sqrt(i); j++) {
					if (i % j == 0) {
						sNT = false;
					}
				}
			}
			if (sNT == true) {
				System.out.println(i + " ");
			}
		}
	}
}
