package demo_java;

import java.util.Scanner;

public class thuc_don {
	public static void thucHienPhepCong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thứ 1:");
		int soA = scanner.nextInt();
		System.out.println("Nhập số thứ 2:");
		int soB = scanner.nextInt();
		int tong = soA + soB;
		System.out.printf("Tổng hai số %d và %d là %d",soA,soB,tong);
	}
	public static void thucHienPhepTru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thứ 1:");
		int soA = scanner.nextInt();
		System.out.println("Nhập số thứ 2:");
		int soB = scanner.nextInt();
		int hieu = soA - soB;
		System.out.printf("Hiệu hai số %d và %d là %d",soA,soB,hieu);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> MÁY TÍNH CÁ NHÂN <<");
		System.out.println("+--------------------+");
		System.out.println("| 1.Cộng             |");
		System.out.println("| 2.Trừ              |");
		System.out.println("| 3.Kết thúc         |");
		System.out.println("+--------------------+");
		System.out.println(">>  Chọn chức năng?   ");
		int nhap = scanner.nextInt();
		switch (nhap) {
		case 1:
			thucHienPhepCong();
			break;
		case 2:
			thucHienPhepTru();
			break;
		default:
			break;
		}
//		if (nhap == 1) {
//			thucHienPhepCong();
//		}else if(nhap == 2) {
//			thucHienPhepTru();
//		}else if(nhap == 3) {
//			System.exit(0);
//		}
	}
}
