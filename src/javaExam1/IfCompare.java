package javaExam1;
import java.util.*;
public class IfCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}

	}

}
