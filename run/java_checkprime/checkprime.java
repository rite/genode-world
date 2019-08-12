import java.util.Scanner;


class CheckPrime
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLong()) {
			boolean isPrime = true;
			long num = scan.nextLong();
			for (long i=2; i<=num/2; i++)
			{
				if (num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			   System.out.println(num + " is a prime number");
			else
			   System.out.println(num + " is not a prime number");
		}
		scan.close();
	}
}
