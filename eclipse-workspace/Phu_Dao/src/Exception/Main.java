package Exception;

public class Main {
	public static void main(String[] args) {
		String a = "10";
		String b = "0";
		try {
			TinhToan ui = new TinhToan();
			System.out.println(ui.chia(a, b));
		} catch (NumberFormatException e) {
			System.out.println("Exception thrown  :" + e);
		} catch (ArithmeticException e) {
			System.out.println("Exception thrown  :" + e);
			System.out.println("Nhập sai!!");
		}
	}
}
