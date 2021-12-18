
public class MultiArray1 {

	public static void main(String[] args) {
		//성적은 아래와 같다
		//구분		국어		영어		수학
		//1학년 1학기	78		78		77
		//1학년 2학기	55		56		88
		//2학년 1학기	78		95		74
		//2학년 2학기	60		90		93
		//3학년 1학기	99		33		57
		//3학년 2학기	77		66		80
		//성적을 배열에 저장
		//과목별 평균을 구하는 프로그램 작성
		
		int array[][] = new int[][]
				{	{78, 78, 77},
					{55, 56, 88},
					{78, 95, 74},
					{60, 90, 93},
					{99, 33, 57},
					{77, 66, 80}
				};
		
		int Subsum = 0;
		String Sub[] = new String[] {"국어", "영어", "수학"};
						
		for(int i = 0; i < array[1].length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				Subsum = Subsum + array[j][i];
			}
			System.out.println(Sub[i] + "평균 : " + Subsum/array.length);
			Subsum = 0;
		}
	}

}
