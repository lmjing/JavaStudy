import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println(solution2("1111", "2222"));
	}
	
	static boolean solution(int n) {
		boolean answer = false;
		int revertedHalf = 0;
	      while(n > revertedHalf) {
	          revertedHalf = revertedHalf * 10 + n % 10;
	          n /= 10;
	      }
	      return n == revertedHalf || n == revertedHalf/10;
	}
	
	static String solution2(String a, String b) {
		int answer = Integer.parseInt(a) + Integer.parseInt(b);
		return Integer.toString(answer);
	}
}
