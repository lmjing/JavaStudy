package IO;

import java.io.*;

/*
 * 기본적으로 자바는 보통 512byte씩 읽어옴
 * 1 byte 읽어오라고 요청 시 511byte버리고 1byte씩 읽어옴
 * 그러므로 성능상 512byte로 잡아 읽어오는 것이 좋다.
 */

public class ByteExam2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/IO/ByteExam.java");

			// �븵�뿉 �븘臾닿쾬�룄 �븞�벐硫� �봽濡쒖젥�듃 諛묒뿉 �옄�룞 �깮
			fos = new FileOutputStream("byte.txt");
						
			// 留덉�留됱씤 媛믪쓣 援щ텇�븯湲� �쐞�븯�뿬
			int readCount = -1;
			// 512바이트씩 읽어 들이기 위해 byte 배열을 사용
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1) {
				// buffer 0 부터 읽어들이는 만큼 쓴다
				fos.write(buffer, 0, readCount);
			}
		} catch (Exception e) {
			// try-catch �옄�룞�깮�꽦�� FileNotFoundException �씠吏�留� �떎瑜� Exception�룄 諛쏄린 �쐞�븯�뿬 �닔
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
