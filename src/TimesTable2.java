
public class TimesTable2 {

	public static void main(String[] args) {
		//2�ܺ��� 9�ܱ��� ����ϴ� ���α׷�
		int dan = 1;
				
		for(int i = 0; i < 9; i++)
		{
			int num = 1;
			
			System.out.println("------" + dan + "��------");
			
			for(int j = 0; j < 9; j++)
			{
				System.out.println(dan + "x" + num + " = " + dan*num);
				num++;
			}
			dan++;
		}

	}

}
