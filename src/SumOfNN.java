
public class SumOfNN {

	public static void main(String[] args) {
		//1~100 �ڿ����� ���� ���ϴ� ���α׷�
		int total = 0;
		int num = 1;
		
		for(int i = 0; i < 100; i++)
		{
			total = total + num;
			num++;
		}
		System.out.println("�ڿ����� �� = " + total);
	}

}
