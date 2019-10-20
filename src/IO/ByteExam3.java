package IO;

import java.io.*;

public class ByteExam3 {
	public static void main(String[] args) {
		// ������ ������ inputStream���� ���� �о�� ��
		try(
				// io��ü ����
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		){
			// io ��ü ���
			out.writeInt(100); // 4byte ����
			out.writeBoolean(true); // 1byte ����
			out.writeDouble(59.5); //8byte ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
