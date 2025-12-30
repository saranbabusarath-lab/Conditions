import java.util.Scanner;
class Muiltiples
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		if(num%3==0&&num%7==0)
		{
			System.out.println("THIS NUMBER IS DUIVISIBLE BY 3&7");
		}
		else if(num%3==0)
		{
			System.out.println(" NUMBER IS DIVISIBLE BY 3");
		}
		else if (num%7==0)
		{
			System.out.println("NUMBER IS DIVISIBLE BY 7");
		}
		else 
		{
			System.out.println("NOT A DIVISIBLE OF 3&7");
		}
	}
	
	
}