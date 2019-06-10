package HoaDon;

public class ThucDon {
	String tenTD;
	int soLuong;
	int giaTien;
	
	public String getTenTD() {
		return tenTD;
	}
	public void setTenTD(String tenTD) {
		this.tenTD = tenTD;
	}

	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

	public int tongTien() {
		return soLuong * giaTien;
	}
}
