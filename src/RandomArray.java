
public class RandomArray {

	public static void main(String[] args) {
		//0~12 사이의 임의의 값을 생성
		//생성된 숫자를 50 크기의 int 배열에 차례로 저장
		//0~12사이의 모든 숫자가 배열에 존재하는지 검사
		
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
			System.out.println("존재하지 않는 수가 있습니다.");
		}
		else
		{
			System.out.println("모두 존재합니다.");
		}

	}

}
