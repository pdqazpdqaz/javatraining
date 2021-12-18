
public class SumOfNN {

	public static void main(String[] args) {
		//1~100 자연수의 합을 구하는 프로그램
		int total = 0;
		int num = 1;
		
		for(int i = 0; i < 100; i++)
		{
			total = total + num;
			num++;
		}
		System.out.println("자연수의 합 = " + total);
	}

}
