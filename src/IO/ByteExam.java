package IO;

import java.io.*;

public class ByteExam {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/IO/ByteExam.java");
			// 앞에 아무것도 안쓰면 프로젝트 밑에 자동 생성
			fos = new FileOutputStream("byte.txt");
			
			// 마지막인 값을 구분하기 위하여
			int readData = -1;
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
		} catch (Exception e) {
			// try-catch 자동생성은 FileNotFoundException 이지만 다른 Exception도 받기 위하여 수정
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
