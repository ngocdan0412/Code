package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		int c;
		try {
			in = new FileInputStream("src\\Files\\file\\input.txt");
			out = new FileOutputStream("src\\Files\\file\\output.txt");

			while ((c = in.read()) != -1) {
				out.write(c);
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			in.close();
			out.close();
		}
	}
}
