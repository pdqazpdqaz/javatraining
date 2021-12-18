package javaExam1;
import java.util.*;
public class ForStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = a;
		String star = "*";
		String blanc = " ";
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b-1; j++) {
				System.out.print(blanc);
			}				
			System.out.println(star);
			star += "*";
			b--;
		}
	}

}
