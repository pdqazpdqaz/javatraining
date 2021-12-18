
public class SumOddNum {

	public static void main(String[] args) {
		//1~100 자연수 중 홀수의 합을 구하는 프로그램
		int num = 1;
		int total = 0;
		
		for(int i = 0; i < 100; i++)
		{
			if(num%2 == 1)
			{
				total = total + num;
			}
			else
			{
				
			}
			num++;
		}
		
		System.out.println("홀수의 합 = " + total);
	}

}
