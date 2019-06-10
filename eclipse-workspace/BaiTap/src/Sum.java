
public class Sum {
	double sum(double... numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Sum demo = new Sum();
		System.out.println(demo.sum(1, 2));
		System.out.println(demo.sum(1, 2, 3));
		System.out.println(demo.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
}
