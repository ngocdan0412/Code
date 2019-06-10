package demo_java;

import java.util.Scanner;

public class HamPTBN {
	public static String hamPTBN(double a, double b) {
		String ketQua = "";
		if(a == 0) {
			if(b == 0) {
				ketQua = "Phương trình vô số nghiệm!";
			}else {
				ketQua = "Phương trình vô nghiệm!";
			}
		}else {
			double x = -b/a;
			ketQua = "Phương trình có nghiệm là: "+x;
		}return ketQua;
	}
	public static String hamPTBH(double a, double b,double c) {
		String ketQua = "";
		if(a == 0) {
			hamPTBN(b, c);
		}else {
			double delta = Math.pow(b,2)-4*a*c;
			if(delta < 0) {
				ketQua = "Phương trình vô nghiệm!";
			}else if(delta == 0) {
				double nghiem = (-b)/(2*a);
				ketQua = "Phương trình có 1 nghiệm kép x = "+nghiem;
			}else {
				double nghiem1 = (-b + Math.sqrt(delta))/(2*a);
				double nghiem2 = (-b - Math.sqrt(delta))/(2*a);
				ketQua = "Phương trình có 2 nghiệm phân biệt Nghiệm x1 = "+nghiem1+" Nghiệm x2 = "+nghiem2;
			}
		}return ketQua;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("GIẢI PHƯƠNG TRINHG BẬC NHẤT");
		System.out.println("Nhập hệ số a:");
		double heSoA = sc.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB = sc.nextDouble();
		System.out.println(hamPTBN(heSoA, heSoB));
		System.out.println();
		System.out.println("GIẢI PHƯƠNG TRINHG BẬC HAI");
		System.out.println("Nhập hệ số a:");
		double heSoA2 = sc.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB2 = sc.nextDouble();
		System.out.println("Nhập hệ số c:");
		double heSoC2 = sc.nextDouble();
		System.out.println(hamPTBH(heSoA2, heSoB2, heSoC2));
	}
}
