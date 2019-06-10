package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("src\\Files\\file\\input.txt");
			out = new FileOutputStream("src\\Files\\file\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
				System.out.print(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
