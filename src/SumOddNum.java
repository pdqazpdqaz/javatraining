
public class SumOddNum {

	public static void main(String[] args) {
		//1~100 �ڿ��� �� Ȧ���� ���� ���ϴ� ���α׷�
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
		
		System.out.println("Ȧ���� �� = " + total);
	}

}
