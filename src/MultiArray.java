
public class MultiArray {

	public static void main(String[] args) {
		//int [3][4] �迭�� 1~12������ ���� �ʱ�ȭ�ϴ� �������� �ۼ�
		
		int array[][] = new int[3][4];
		int num = 1;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = num;
				num++;
				System.out.println(array[i][j]);
			}
		}
		
		

	}

}
