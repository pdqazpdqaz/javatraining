
public class TimesTable2 {

	public static void main(String[] args) {
		//2단부터 9단까지 출력하는 프로그램
		int dan = 1;
				
		for(int i = 0; i < 9; i++)
		{
			int num = 1;
			
			System.out.println("------" + dan + "단------");
			
			for(int j = 0; j < 9; j++)
			{
				System.out.println(dan + "x" + num + " = " + dan*num);
				num++;
			}
			dan++;
		}

	}

}
