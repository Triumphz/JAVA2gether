package about_class;

import java.util.Scanner;

public class StudentTest
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student [] s = new Student [3];  // �ѹ����� New s ����� array 10��ͧ
		for (int i =0; i <s.length;i++)
		{
			System.out.println("Please input name,surname,score of studen["+i+"]");
			s[i] = new Student (); // New Object �ͧ s ���Ъ�ͧ
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			sc.nextLine();
		}
		Student max = s[0];
		for(int i =0; i<s.length;i++)
		{
			if (max.score < s[i].score)
			{
				max = s[i];
			}
		}
System.out.println(max.name+" "+max.score);
	}

}
