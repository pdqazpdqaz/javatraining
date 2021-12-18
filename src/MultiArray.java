
public class MultiArray {

	public static void main(String[] args) {
		//int [3][4] 배열을 1~12까지의 수로 초기화하는 루프문을 작성
		
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
