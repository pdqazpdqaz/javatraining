
public class PrimeNumberPrint {

	public static void main(String[] args) {
		//1~100 자연수 중 소스(Prime Number) 출력하는 프로그램
		int num = 2;
		int total = 0;
		boolean isTrue = false;
		
		for(int i = 0; i < 99; i++)
		{
			int Tnum = 2; //num이 Tnum으로 나눠진다면 소수가 아님
			
			//Tnum을 증가시키면서 1과 자기자신 외에 나누어 떨어지는지 확인
			for(int j = 0; j < num-2; j++)
			{
				
				if(num%Tnum == 0)
				{
					isTrue = true; //나누어 떨어지면 true
				}
				Tnum++;
			}
			
			//false라면 소수라고 판단
			if(isTrue == false)
			{
				total = total + num;
				System.out.println(num);
			}
			else
			{
				
			}
			num++;
			isTrue = false;
		}
		
		System.out.println(total);

	}

}
