package Opp;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiHS {
	private ArrayList<DSHocSinh> listHS;
	private Scanner sc;
	
	public QuanLiHS() {
		listHS = new ArrayList<DSHocSinh>();
		sc = new Scanner(System.in);
	}
	
	public void nhap() { 
		for(int i = 0; i < 3; i++) {
			int lop;
			DSHocSinh hocSinh = new DSHocSinh();
			System.out.print("Nhập tên học sinh: ");
			hocSinh.setTen(sc.nextLine());
			System.out.print("Nhập lớp: ");
			lop = Integer.parseInt(sc.nextLine());
			hocSinh.setLop(lop);

			if(lop == 1) {
				System.out.print("Nhập điểm môn tiếng việt: ");
				hocSinh.setTiengViet(Float.parseFloat(sc.nextLine()));
			}else if(lop == 2) {
				System.out.print("Nhập điểm môn tiếng việt: ");
				hocSinh.setTiengViet(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn toán: ");
				hocSinh.setToan(Float.parseFloat(sc.nextLine()));
			}else if(lop == 3) {
				System.out.print("Nhập điểm môn tiếng việt: ");
				hocSinh.setTiengViet(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn toán: ");
				hocSinh.setToan(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn vẽ: ");
				hocSinh.setVe(Float.parseFloat(sc.nextLine()));
			}else if(lop == 4) {
				System.out.print("Nhập điểm môn tiếng việt: ");
				hocSinh.setTiengViet(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn toán: ");
				hocSinh.setToan(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn vẽ: ");
				hocSinh.setVe(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn tin: ");
				hocSinh.setTin(Float.parseFloat(sc.nextLine()));
			}else {
				System.out.print("Nhập điểm môn tiếng việt: ");
				hocSinh.setTiengViet(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn toán: ");
				hocSinh.setToan(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn vẽ: ");
				hocSinh.setVe(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn tin: ");
				hocSinh.setTin(Float.parseFloat(sc.nextLine()));
				System.out.print("Nhập điểm môn tiếng anh: ");
				hocSinh.setAnh(Float.parseFloat(sc.nextLine()));
			}

			listHS.add(hocSinh);
		}
	}
	
	public void hienThi() {
		System.out.println("Hiển thị danh sách học sinh:");
		for(int i = 0; i < listHS.size(); i++) {
			if(listHS.get(i).getLop() == 1) {
				System.out.println("Tên: " + listHS.get(i).getTen());
				System.out.println("Lớp: " + listHS.get(i).getLop());
				System.out.println("Điểm Tiếng việt: " + listHS.get(i).getTiengViet());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else if(listHS.get(i).getLop() == 2) {
				System.out.println("Tên: " + listHS.get(i).getTen());
				System.out.println("Lớp: " + listHS.get(i).getLop());
				System.out.println("Điểm Tiếng việt: " + listHS.get(i).getTiengViet());
				System.out.println("Điểm Toán: " + listHS.get(i).getToan());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else if(listHS.get(i).getLop() == 3) {
				System.out.println("Tên: " + listHS.get(i).getTen());
				System.out.println("Lớp: " + listHS.get(i).getLop());
				System.out.println("Điểm Tiếng việt: " + listHS.get(i).getTiengViet());
				System.out.println("Điểm Toán: " + listHS.get(i).getToan());
				System.out.println("Điểm Vẽ: " + listHS.get(i).getVe());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else if(listHS.get(i).getLop() == 4) {
				System.out.println("Tên: " + listHS.get(i).getTen());
				System.out.println("Lớp: " + listHS.get(i).getLop());
				System.out.println("Điểm Tiếng việt: " + listHS.get(i).getTiengViet());
				System.out.println("Điểm Toán: " + listHS.get(i).getToan());
				System.out.println("Điểm Vẽ: " + listHS.get(i).getVe());
				System.out.println("Điểm Tin: " + listHS.get(i).getTin());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else {
				System.out.println("Tên: " + listHS.get(i).getTen());
				System.out.println("Lớp: " + listHS.get(i).getLop());
				System.out.println("Điểm Tiếng việt: " + listHS.get(i).getTiengViet());
				System.out.println("Điểm Toán: " + listHS.get(i).getToan());
				System.out.println("Điểm Vẽ: " + listHS.get(i).getVe());
				System.out.println("Điểm Tin: " + listHS.get(i).getTin());
				System.out.println("Điểm Tiếng anh: " + listHS.get(i).getAnh());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}	
		}
	}
}
