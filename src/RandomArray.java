
public class RandomArray {

	public static void main(String[] args) {
		//0~12 ������ ������ ���� ����
		//������ ���ڸ� 50 ũ���� int �迭�� ���ʷ� ����
		//0~12������ ��� ���ڰ� �迭�� �����ϴ��� �˻�
		
		int array[] = new int[50];
		boolean isTrue[] = new boolean[12];
		boolean Test = true;
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random()*12);
		}
		
		for(int i = 0; i < isTrue.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(i == array[j])
				{
					isTrue[i] = true;
				}
				
			}
			
			if(isTrue[i] != true)
			{
				Test = false;
			}
		}
		
		if(Test == false)
		{
			System.out.println("�������� �ʴ� ���� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("��� �����մϴ�.");
		}

	}

}
