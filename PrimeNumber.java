import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int i;
		
		for(i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				break;
			}
		}

		if(num == i)
		{
			System.out.println("It's a prime number");
		}
		else
		{
			System.out.println("It's not a prime number");
		}
	}
}
