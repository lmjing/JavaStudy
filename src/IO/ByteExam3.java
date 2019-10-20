package IO;

import java.io.*;

public class ByteExam3 {
	public static void main(String[] args) {
		// 생성된 파일은 inputStream으로 따로 읽어야 함
		try(
				// io객체 선언
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		){
			// io 객체 사용
			out.writeInt(100); // 4byte 저장
			out.writeBoolean(true); // 1byte 저장
			out.writeDouble(59.5); //8byte 저장
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
