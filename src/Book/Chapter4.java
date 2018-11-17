package Book;

public class Chapter4 {

	public static void main(String[] args) {
		question2();
	}
	
	static void question1() {
		byte total = 0;
		for (int cnt = 0; cnt < 10; cnt++) 
			total = (byte) (total + cnt);
		System.out.println(total);
	}
	
	static void question2() {
		System.out.println(- - 100);
		System.out.println(100 == 100.0);
		System.out.println(12e2 < 1234);
	}

}
