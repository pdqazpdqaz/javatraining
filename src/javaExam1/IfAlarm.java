package javaExam1;
import java.util.*;
public class IfAlarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if(b < 45) {
			a--;
			b = 15 + b;
			if(a < 0)
			{
				a = 23;
			}
			System.out.println(a +" "+ b);
		}
		else {
			System.out.println(a + " " + (b-45));
		}
	}

}
