import java.util.ArrayList;
import java.util.Scanner;

public class ChucNang{
	private Scanner sc;
	private ArrayList<BenhNhan> listBN;
	private ArrayList<BacSy> listBS;
	public ChucNang() {
		listBN = new ArrayList<BenhNhan>();
		listBS = new ArrayList<BacSy>();
		sc = new Scanner(System.in);
	}
	public void menu(){
		while (true) {
			System.out.println(
					 "1/ Thêm mới hồ sơ bệnh nhân \n"
					+"2/ Hiển thị thông tin tất cả bệnh nhân \n"
					+"3/ Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím \n"
					+"4/ Tính tổng các số tiền của tất cả bệnh nhân \n"
					+"5/ Tìm bệnh nhân có tiền trả nhiều nhất \n"
					+"6/ TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím \n"
					+"7/ Thêm mới nhân viên \n"
					+"8/ Hiển thị tất cả bác sỹ \n"
					+"9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím \n"
					+"10/ Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím \n"
					+"11/ Xóa bác sỹ với mã tương ứng");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				nhapBN();
				break;
			case 2:
				thongTinBN();
				break;
			case 3:
				traMaBN();
				break;
			case 4:
				tongTienBN();
				break;
			case 5:
				maxTienBN();
				break;
			case 6:
				timBN();
				break;
			case 7:
				nhapBS();
				break;
			case 8:
				thongTinBS();
				break;
			case 9:
				traKhoaBS();
				break;
			case 10:
				thayDoiPhuCap();
				break;
			case 11:
				xoaBS();
				break;
			default:
				System.out.println("Chức năng bạn nhập không hợp lệ");
			}
		}
	}
	
//------------------------> 1 <------------------------------
	public void nhapBN(){
		
		System.out.print("Số lượng bệnh nhân cần thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(n);
		for(int i=0;i<n;i++){
			BenhNhan BenhNhan = new BenhNhan();
			System.out.print("Nhập tên: ");
			BenhNhan.setTen(sc.nextLine());
			System.out.print("Nhập tuổi: ");
			BenhNhan.setTuoi(Double.parseDouble(sc.nextLine()));
			System.out.print("Nhập giới tính: ");
			BenhNhan.setGioiTinh(sc.nextLine());
			System.out.print("Nhập CMND: ");
			BenhNhan.setCMND(Double.parseDouble(sc.nextLine()));
			System.out.print("Nhập mã: ");
			BenhNhan.setMaBenhNhan(sc.nextLine());
			System.out.print("Nhập tên bệnh: ");
			BenhNhan.setBenh(sc.nextLine());
			System.out.print("Nhập phương pháp chữa bệnh: ");
			BenhNhan.setPhuongPhapChuaBenh(sc.nextLine());
			System.out.print("Nhập ngày vào viện: ");
			BenhNhan.setNgayNhapVien(sc.nextLine());
			System.out.print("Nhập ngày ra viện: ");
			BenhNhan.setNgayRaVien(sc.nextLine());
			System.out.print("Nhập viện phí: ");
			BenhNhan.setTienThanhToan(Double.parseDouble(sc.nextLine()));
			listBN.add(BenhNhan);
			System.out.println();
		}
	}
//------------------------> 2 <------------------------------
	public void thongTinBN(){
		for(int i = 0; i < listBN.size(); i++) {
			System.out.println("Bệnh nhân thứ " + (i +1) + ": " + listBN.get(i).getTen());
			System.out.println("Tuổi : " + listBN.get(i).getTuoi());
			System.out.println("Giới Tính : " + listBN.get(i).getGioiTinh());
			System.out.println("Số CMND : " + listBN.get(i).getCMND());
			System.out.println("Bệnh : " + listBN.get(i).getBenh());
			System.out.println("Mã bệnh nhân : " + listBN.get(i).getMaBenhNhan());
			System.out.println("Phương pháp chữa bệnh : " + listBN.get(i).getPhuongPhapChuaBenh());
			System.out.println("Ngày nhập viện : " + listBN.get(i).getNgayNhapVien());
			System.out.println("Ngày ra viện : " + listBN.get(i).getNgayRaVien());
			System.out.println("Tiền thanh toán : " + listBN.get(i).getTienThanhToan());
		}	
	}
//------------------------> 3 <------------------------------
	public void traMaBN(){
		String ma = sc.nextLine();
		for(int i=0;i< listBN.size();i++){
			if(listBN.get(i).getMaBenhNhan().equals(ma)){
				System.out.println("Bệnh nhân thứ " + (i +1) + ": " + listBN.get(i).getTen());
				System.out.println("Tuổi : " + listBN.get(i).getTuoi());
				System.out.println("Giới Tính : " + listBN.get(i).getGioiTinh());
				System.out.println("Số CMND : " + listBN.get(i).getCMND());
				System.out.println("Bệnh : " + listBN.get(i).getBenh());
				System.out.println("Mã bệnh nhân : " + listBN.get(i).getMaBenhNhan());
				System.out.println("Phương pháp chữa bệnh : " + listBN.get(i).getPhuongPhapChuaBenh());
				System.out.println("Ngày nhập viện : " + listBN.get(i).getNgayNhapVien());
				System.out.println("Ngày ra viện : " + listBN.get(i).getNgayRaVien());
				System.out.println("Tiền thanh toán : " + listBN.get(i).getTienThanhToan());
			}
		}
	}
//------------------------> 4 <------------------------------
	public void tongTienBN(){
		double tong = 0;
		for(int i = 0; i < listBN.size(); i++) {
			tong+= listBN.get(i).getTienThanhToan();
		}
		System.out.println("Tổng số tiền của tất cả bệnh nhân là: "+tong);
	}
//------------------------> 5 <------------------------------
	public void maxTienBN(){
		double max = listBN.get(0).getTienThanhToan();
		for(int i = 1; i < listBN.size(); i++) {
			if(max < listBN.get(i).getTienThanhToan()){
				max = listBN.get(i).getTienThanhToan();
				System.out.println(listBN.get(i).getTen());
			}
		}
	}
//------------------------> 6 <------------------------------
	public void timBN(){
		String nhapBenh = sc.nextLine();
		System.out.println("Các bệnh nhân bị bệnh "+nhapBenh+" là: ");
		for(int i = 0; i < listBN.size(); i++) {
			if(listBN.get(i).getBenh().equals(nhapBenh)){
				System.out.println(listBN.get(i).getTen());
			}
		}
	}
//------------------------> 7 <------------------------------
	public void nhapBS(){
		System.out.println("Số lượng bác sỹ: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			BacSy BacSy = new BacSy();
			BacSy.setTen(sc.nextLine());
			BacSy.setTuoi(Double.parseDouble(sc.nextLine()));
			BacSy.setGioiTinh(sc.nextLine());
			BacSy.setCMND(Double.parseDouble(sc.nextLine()));
			BacSy.setMaBacSy(sc.nextLine());
			BacSy.setKhoa(sc.nextLine());
			BacSy.setNgayBatDauVaoLam(sc.nextLine());
			BacSy.setLuong(Double.parseDouble(sc.nextLine()));
			BacSy.setPhuCap(Double.parseDouble(sc.nextLine()));
			listBS.add(BacSy);
		}
	}
//------------------------> 8 <------------------------------
	public void thongTinBS(){
		for(int i = 0; i < listBS.size(); i++) {
			System.out.println("Bác sỹ thứ " + (i +1) + ": " + listBS.get(i).getTen());
			System.out.println("Tuổi : " + listBS.get(i).getTuoi());
			System.out.println("Giới Tính : " + listBS.get(i).getGioiTinh());
			System.out.println("Số CMND : " + listBS.get(i).getCMND());
			System.out.println("Mã bác sỹ : " + listBS.get(i).getMaBacSy());
			System.out.println("Khoa : " + listBS.get(i).getKhoa());
			System.out.println("Ngày bắt đầu làm : " + listBS.get(i).getNgayBatDauVaoLam());
			System.out.println("Lương : " + listBS.get(i).getLuong());
			System.out.println("Phụ cấp : " + listBS.get(i).getPhuCap());
		}	
	}
//------------------------> 9 <------------------------------
	public void traKhoaBS(){
		String khoaNganh = sc.nextLine();
		for(int i=0;i< listBS.size();i++){
			if(listBS.get(i).getKhoa().equals(khoaNganh)){
				System.out.println("Bác sỹ thứ " + (i +1) + ": " + listBS.get(i).getTen());
				System.out.println("Tuổi : " + listBS.get(i).getTuoi());
				System.out.println("Giới Tính : " + listBS.get(i).getGioiTinh());
				System.out.println("Số CMND : " + listBS.get(i).getCMND());
				System.out.println("Mã bác sỹ : " + listBS.get(i).getMaBacSy());
				System.out.println("Khoa : " + listBS.get(i).getKhoa());
				System.out.println("Ngày bắt đầu làm : " + listBS.get(i).getNgayBatDauVaoLam());
				System.out.println("Lương : " + listBS.get(i).getLuong());
				System.out.println("Phụ cấp : " + listBS.get(i).getPhuCap());
			}
		}
	}
//------------------------> 10 <------------------------------
	public void thayDoiPhuCap() {
		String maBS = sc.nextLine();
		System.out.println("Nhập mã bác sỹ cần thay đổi phụ cấp: ");
		for (int i = 0; i < listBS.size(); i++) {
			if(listBS.get(i).getMaBacSy().equals(maBS)){
				System.out.println("Nhập phụ cấp mới: ");
				listBS.get(i).setPhuCap(Double.parseDouble(sc.nextLine()));
			}
		}
	}
//------------------------> 11 <------------------------------
	public void xoaBS() {
		String maBS = sc.nextLine();
		for (int i = 0; i < listBS.size(); i++) {
			if(listBS.get(i).getMaBacSy().equals(maBS)){
				listBS.remove(i);
			}
		}
	}
}