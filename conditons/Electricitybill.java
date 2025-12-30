import java.util.Scanner;
class Electricitybill
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		if (units<=100)
		{
			bill=units*5;
		}
		else if(units<=200)
		{
			bill=(100*5)+((units-100)*7);
		}
		else
		{
			bill=(100*5)+(100*7)+((unit-200)*10);
		}
			System.out.println("Electricity bill :Ammount"+ bill);
	}
	
	
	
}