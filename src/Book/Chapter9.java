package Book;

import java.text.*;
import java.util.*;

public class Chapter9 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for (String arg : args) {
			str.append(arg);
		}
		System.out.println(str);
		
		after1000days();
	}
	
	public static void after1000days() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("YYYY³â MM¿ù ddÀÏ");
		String date = dateformat.format(cal.getTime());
		System.out.println(date);
	}
}