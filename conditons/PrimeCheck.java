import java.util.Scanner;

class PrimeCheck
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1)
            System.out.println("Not a Prime Number");
        else if (n == 2)
            System.out.println("Prime Number");
        else if (n % 2 == 0)
            System.out.println("Not a Prime Number");
        else
            System.out.println("Prime Number");
    }
}
