
package a_book;

public class loop19
{

	public static void main(String[] args)
	{
		int x=1;
		while (x <=100)
		{            
			if((x%3== 0|| x%5 == 0)!=(x%3== 0&& x%5 == 0))/// ��ػ��ͼ��Ѿ�� 2������ҷӡ���礡ѹ
			//if(x%3== 0&& x%5 == 0)
			{
				
		System.out.println(x);
		}
				
		x++;
		}
		
		
	
}

	}





//	if((x%3== 0|| x%5 == 0)!=(x%3== 0&& x%5 == 0))