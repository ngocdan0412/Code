package HoaDon;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {
	ArrayList<ThucDon> list = new ArrayList<ThucDon>();
	Scanner sc = new Scanner(System.in);
//	public void add() {
//		System.out.println("Nhập số lượng món: ");
//		int n = Integer.parseInt(sc.nextLine());
//		for(int i = 0; i < n; i++) {
//			ThucDon thucDon = new ThucDon();
//			System.out.println("Nhập tên món: ");
//			thucDon.setTenTD(sc.nextLine());
//			System.out.println("Nhập số lượng: ");
//			thucDon.setSoLuong(Integer.parseInt(sc.nextLine()));
//			System.out.println("Nhập đơn giá: ");
//			thucDon.setGiaTien(Integer.parseInt(sc.nextLine()));
//			
//			list.add(thucDon);
//			System.out.println("Đã thêm!!");
//		}
//	}
	
	public void add() {
		int stt = 0;
		while(!"=".equals(stt)) {
			if(stt == 0) {
				ThucDon thucDon = new ThucDon();
				System.out.println("Nhập tên món: ");
				thucDon.setTenTD(sc.nextLine());
				stt++;
			}else if(stt == 1) {
				System.out.println("Nhập số lượng: ");
				thucDon.setSoLuong(Integer.parseInt(sc.nextLine()));
				stt++;
			}else {
				System.out.println("Nhập đơn giá: ");
				thucDon.setGiaTien(Integer.parseInt(sc.nextLine()));
				list.add(thucDon);
				System.out.println("Đã thêm!!");
				stt = 0;
			}
			
		}
	}
	
	public void xuat() {
		int tong = 0;
		System.out.println("BIÊN LAI");
		for(int i = 0; i < list.size(); i++) {
			System.out.printf(list.get(i).getTenTD()+"\t"+ list.get(i).getSoLuong() + "\t"+ list.get(i).getGiaTien());
			System.out.println();
		}
		System.out.println("====================");
		System.out.printf("Tổng tiền:\t");
		for(int i = 0; i < list.size(); i++) {
			tong += list.get(i).tongTien();
		}
		System.out.println(tong);
	}
}
