import java.util.Scanner;

public class baiTap {
	public static Scanner scanner = new Scanner(System.in);
	public static int[] mang = new int[100];
	public static int size = 0;
	public static void menu() {
		System.out.println(
						"+------------------------> MENU <------------------------+\r\n" +
						"| 1.  Hiển thị danh sách số vừa nhập                     |\r\n" + 
						"| 2.  Hiển thị những số chẵn trong danh sách             |\r\n" + 
						"| 3.  Sắp xếp danh sách số theo thứ tự tăng dần          |\r\n" + 
						"| 4.  Sắp xếp danh sách số theo thứ tự giảm dần          |\r\n" + 
						"| 5.  Tìm 1 số trong mảng bằng với số nhập từ bàn phím   |\r\n" + 
						"| 6.  Tính tổng các phần tử trong danh sách              |\r\n" + 
						"| 7.  Tìm giá trị max trong danh sách                    |\r\n" + 
						"| 8.  Tìm giá trị min trong danh sách                    |\r\n" + 
						"| 9.  Tính tổng các số lẻ trong mảng                     |\r\n" + 
						"| 10. Tính tổng các số nguyên tố trong mảng              |\r\n" + 
						"| 11. Loại các số bị trùng lặp trong mảng                |\r\n" + 
						"| 12. Update số tại vị trí nhập từ bàn phím              |\r\n" + 
						"| 13. Xóa 1 số bằng với số nhập từ bàn phím              |\r\n" + 
						"| 14. Thêm mới 1 số vào mảng                             |\r\n" + 
						"| 15. Kiểm tra mảng có phải là 1 dãy chẵn lẻ hay không   |\r\n" + 
						"| 16. Thoát chương trình                                 |\r\n" +
						"+--------------------------------------------------------+\r\n" +
				"Chọn chức năng:");
	}
	public static void hienThiMang() {
		System.out.println("Mảng vừa nhập:");
		for(int i=0;i<size;i++) {
			System.out.print(mang[i]+"  ");
		}
		System.out.println();
	}
	public static void mangChan() {
		for(int i=0;i<size;i++) {
			if(mang[i] % 2 ==0) {
				System.out.print(mang[i]+"  ");
			}
		}
		System.out.println();
	}
	public static void mangTang() {
		int tam;
		for (int i=0;i<size-1;i++) {
			for (int j=i+1;j<size;j++) {
				if (mang[i] > mang[j]) {
					tam = mang[j];
					mang[j] = mang[i];
					mang[i] = tam;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(mang[i]+"  ");
		}
		System.out.println();
	}
	public static void mangGiam() {
		int tam;
		for (int i=0;i<size-1;i++) {
			for (int j=i+1;j<size;j++) {
				if (mang[i] < mang[j]) {
					tam = mang[j];
					mang[j] = mang[i];
					mang[i] = tam;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(mang[i]+"  ");
		}
		System.out.println();
	}
	public static void mangTim() {
		int viTri = -1;
		System.out.println("Nhập một số cần tìm:");
		int soCanTim = scanner.nextInt();
		for(int i=0;i<size;i++) {
			if(soCanTim == mang[i]) {
				viTri = i+1;
			}
		}
		if(viTri > -1) {
			System.out.printf("Số cần tìm là %d và ở vị trí thứ %d trong mảng.",soCanTim,viTri);
		}else {
			System.out.print("Không tìm thấy!");
		}
		System.out.println();
	}
	public static void mangTong() {
		int tong = 0;
		for(int i=0;i<size;i++) {
			tong += mang[i];
		}
		System.out.println("Tổng các phần tử trong mảng bằng: "+tong);
	}
	public static void mangMax() {
		int max = mang[0];
		for(int i=1;i<size;i++) {
			if(max < mang[i]) {
				max = mang[i];
			}
		}
		System.out.println("Giá trị lớn nhất trong mảng là: "+max);
	}
	public static void mangMin() {
		int min = mang[0];
		for(int i=1;i<size;i++) {
			if(min > mang[i]) {
				min = mang[i];
			}
		}
		System.out.println("Giá trị lớn nhất trong mảng là: "+min);
	}
	public static void mangTongLe() {
		int tong = 0;
		for(int i=0;i<size;i++) {
			if(mang[i] % 2 !=0) {
				tong += mang[i];
			}
		}
		System.out.println("Tổng các phần tử lẻ trong mảng bằng: "+tong);
	}
	public static void mangTongSNT() {
		boolean sNT = true;
		int tong = 0;
		for(int i=0;i<size;i++) {
			if(mang[i]<2) {
				sNT = false;
			}else if(mang[i]==2) {
				sNT = true;
			}else {
				for(int j=2;j<=mang[i]-1;j++){
					if ( mang[i] % j == 0) {
						sNT = false;
					}
				}
			}	        
			if(sNT == true) {
				tong += mang[i];
			}
		}
		System.out.println("Tổng các số nguyên tố trong mảng là: "+tong);
	}
	public static void mangLoc() {
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;) {
				if(mang[i]==mang[j]) {
					System.out.println("vị trí "+(j+1));
					if(j==(size-1)) {
						size--;
					}else {
						for(int f=j;f<size;f++) {
							mang[f]=mang[f+1];
						}
						size--;
					}					
				}
				j++;
			}
		}
	}
	//	-------------------------------------------------------------------------------------
	public static void main(String[] args) {
		String nhapSo;
		System.out.println("Nhập các phần tử trong mảng:\n" +
				"Nhập <exit> để lưu mảng!");
		while(true) {
			nhapSo = scanner.nextLine();
			if(nhapSo.equals("exit")) {
				break;
			}else {
				mang[size++] = Integer.parseInt(nhapSo);
			}
		}
		menu();
		while(true) {
			int chon = scanner.nextInt();
			while(chon<1 || chon>16) {
				System.out.println("Lỗi! Chọn lại chức năng");
				chon = scanner.nextInt();
			}
			if(chon == 16) {
				break;
			}else {
				switch (chon) {
				case 1:
					hienThiMang();
					break;
				case 2:
					mangChan();
					break;
				case 3:
					mangTang();
					break;
				case 4:
					mangGiam();
					break;
				case 5:
					mangTim();
					break;
				case 6:
					mangTong();
					break;
				case 7:
					mangMax();
					break;
				case 8:
					mangMin();
					break;
				case 9:
					mangTongLe();
					break;
				case 10:
					mangTongSNT();
					break;
				case 11:
					mangLoc();
					hienThiMang();
					break;
				default:
					break;
				}
			}
		}
	}
}
