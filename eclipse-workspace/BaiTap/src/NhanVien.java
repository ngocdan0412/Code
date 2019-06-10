import java.util.Scanner;

public class NhanVien {
	String fullName;
	double salary;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên:");
		this.fullName = sc.nextLine();
		System.out.println("Nhập lương");
		this.salary = sc.nextDouble();
	}
	public void output() {
		System.out.println("Tên là: "+fullName);
		System.out.println("Lương là: "+String.format("%f", salary));
	}
	public void setInfo(String fullName, double salary) {
		this.fullName = fullName;
		this.salary = salary;
	}
	double incomeTax() {
		if (salary <= 5000000) {
			return 0;
		}else {
			return (salary - 5000000)*10/100;
		}
	}
	public static void main(String[] args) {
		NhanVien nhanVien1 = new NhanVien();
		nhanVien1.input();
		nhanVien1.output();
		nhanVien1.setInfo("fullName", 2000000);
		nhanVien1.output();
		System.out.print("Thuế: ");
		System.out.println(nhanVien1.incomeTax());
	}
}