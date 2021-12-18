
public class MaxNumSearch {

	public static void main(String[] args) {
		//배열에 저장된 값 중 가장 큰 수 위치를 구하고 출력
		
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
		
		System.out.println("가장 큰 값 : " + MaxValue);
		System.out.println("가장 큰 값의 인덱스 : " + MaxIndex);

	}

}
