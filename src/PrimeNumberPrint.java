
public class PrimeNumberPrint {

	public static void main(String[] args) {
		//1~100 �ڿ��� �� �ҽ�(Prime Number) ����ϴ� ���α׷�
		int num = 2;
		int total = 0;
		boolean isTrue = false;
		
		for(int i = 0; i < 99; i++)
		{
			int Tnum = 2; //num�� Tnum���� �������ٸ� �Ҽ��� �ƴ�
			
			//Tnum�� ������Ű�鼭 1�� �ڱ��ڽ� �ܿ� ������ ���������� Ȯ��
			for(int j = 0; j < num-2; j++)
			{
				
				if(num%Tnum == 0)
				{
					isTrue = true; //������ �������� true
				}
				Tnum++;
			}
			
			//false��� �Ҽ���� �Ǵ�
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
