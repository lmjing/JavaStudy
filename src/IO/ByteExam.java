package IO;

import java.io.*;

public class ByteExam {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/IO/ByteExam.java");

			fos = new FileOutputStream("byte.txt");
						
			int readData = -1;
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
