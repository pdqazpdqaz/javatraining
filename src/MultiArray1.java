
public class MultiArray1 {

	public static void main(String[] args) {
		//������ �Ʒ��� ����
		//����		����		����		����
		//1�г� 1�б�	78		78		77
		//1�г� 2�б�	55		56		88
		//2�г� 1�б�	78		95		74
		//2�г� 2�б�	60		90		93
		//3�г� 1�б�	99		33		57
		//3�г� 2�б�	77		66		80
		//������ �迭�� ����
		//���� ����� ���ϴ� ���α׷� �ۼ�
		
		int array[][] = new int[][]
				{	{78, 78, 77},
					{55, 56, 88},
					{78, 95, 74},
					{60, 90, 93},
					{99, 33, 57},
					{77, 66, 80}
				};
		
		int Subsum = 0;
		String Sub[] = new String[] {"����", "����", "����"};
						
		for(int i = 0; i < array[1].length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				Subsum = Subsum + array[j][i];
			}
			System.out.println(Sub[i] + "��� : " + Subsum/array.length);
			Subsum = 0;
		}
	}

}
