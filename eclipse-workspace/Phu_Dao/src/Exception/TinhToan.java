package Exception;

public class TinhToan {
	public float chia(String a, String b) {
		int sa = 0;
		int sb = 0;
		try {
			sa = Integer.parseInt(a);
			sb = Integer.parseInt(b);
			return sa / sb;
		} catch (NumberFormatException e) {
			System.out.println("Không phải kiểu số!!");
			throw e;
		} catch (ArithmeticException e) {
			System.out.println("Nhập sai rồi!!");
			throw e;
		}
	}
}
