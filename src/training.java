import java.util.Scanner;

public class training {

	public static void main(String[] args) {
		/*
		if(args.length!=1)
		{
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i = 0; i < coinUnit.length; i++)
		{
			int coinNum = 0;
			coinNum = money/coinUnit[i];
						
			if(coin[i] > coinNum) 
			{
				money = money - (coinNum*coinUnit[i]);
				coin[i] = coin[i] - coinNum;
			}
			else
			{
				money = money - (coin[i]*coinUnit[i]);
				coin[i] = 0;
			}
		}
		
		if(money > 0)
		{
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		System.out.println("=���� ������ ���� = ");
		
		for(int i = 0; i < coinUnit.length; i++) 
		{
			System.out.println(coinUnit[i]+"��: "+ coin[i]);
		}
		*/
		
		/*
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			
			for(int j = 0; j < counter[i]; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		/*
		char[][]star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				result[j][i] = star[star.length-(i+1)][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		*/
		
		/*
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int [][] result = new int[score.length+1] [score[0].length+1];
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j]; 
			}
		}
			
		for(int i=0; i < result.length; i++) {
			for(int j=0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		*/
		
		/*
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < words.length; i++) {
			System.out.printf("Q%d, %s�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			if(tmp.equals(words[i][1])){
				System.out.printf("�����Դϴ�.%n%n");
				count++;
			}
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);;
			}
		}
		
		System.out.println("��ü " + words.length + "���� �� " + count + "���� ���߼̽��ϴ�.");
		*/
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j < 10; j++) {
				int tmp1 = (int)(Math.random()*question.length);
				int tmp2 = (int)(Math.random()*question.length);
				char c = question[tmp1];
				question[tmp1] = question[tmp2];
				question[tmp2] = c;
			}
			System.out.printf("Q%d, %s�� ������ �Է��ϼ���.>",
													i+1, new String(question));
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.%n%n");
		}
	}
}
