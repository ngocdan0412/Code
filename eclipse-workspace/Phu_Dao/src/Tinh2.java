import java.util.Scanner;

public class Tinh2{
	public static void main(String[] args) {
		Tinh ui = new Tinh();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		ui.a = sc.nextInt();
		System.out.print("Nhập số b: ");
		ui.b = sc.nextInt();
		System.out.print("Nhập phép tính(viết thường không dấu): ");
		sc.nextLine();
		String nhap = sc.nextLine();
		
		float zo = 0;
		switch (nhap) {
		case "+":
			zo = ui.cong();
			break;
		case "-":
			zo = ui.tru();
			break;
		case "*":
			zo = ui.nhan();
			break;
		case "/":
			zo = ui.chia();
			break;
		default:
			break;
		}
		System.out.println("Phép tính a "+ nhap +" b = "+ zo);
	}
}
