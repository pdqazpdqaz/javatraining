
public class MaxNumSearch {

	public static void main(String[] args) {
		//�迭�� ����� �� �� ���� ū �� ��ġ�� ���ϰ� ���
		
		int array[] = new int[] {13, 19, 38, 22, 4, 56, 77, 12};
		int MaxValue = 0;
		int MaxIndex = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(MaxValue < array[i])
			{
				MaxValue = array[i];
				MaxIndex = i;
			}
			else
			{
				
			}
		}
		
		System.out.println("���� ū �� : " + MaxValue);
		System.out.println("���� ū ���� �ε��� : " + MaxIndex);

	}

}
