import java.util.Scanner;

public class SinhVien {
	public static Scanner sc = new Scanner(System.in);
	public static String hoTen;
	public static double diemTB;

	void nhap() {
		System.out.println("Nhập tên:");
		hoTen = sc.nextLine();
		System.out.println("Nhập điểm:");
		diemTB = sc.nextDouble();
	}

	void xuat(String a, double b) {
		System.out.println("Bạn " + a + " có điểm trung bình là: " + b);
		System.out.print("Và xếp loại: ");
	}

	void xepLoai(double a) {
		if (a < 6) {
			System.out.println("Trung bình");
		} else if (a >= 6 || a < 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Giỏi");
		}
	}

	public static void main(String[] args) {
		SinhVien sinhvien = new SinhVien();
		sinhvien.nhap();
		sinhvien.xuat(hoTen, diemTB);
		sinhvien.xepLoai(diemTB);
	}
}
