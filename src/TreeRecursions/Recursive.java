package TreeRecursions;

public class Recursive {
	public static int pri(int a)
	{
		if(a == 0)
		{
			return a;
		}
		else
		{
			return a+pri(--a);
		}
	}
	public static int fact(int a)
	{
		if(a == 0)
		{
			return 1;
		}
		else
		{
			return a*fact(--a);
		}
	}
	public static int fib(int a)
	{
		if(a <= 1)
		{
			return a;
		}
		else
		{
			return fib(a-1)+fib(a-2);
		}
	}
	public static void main(String[] args)
	{
		System.out.println(pri(10));
		System.out.println(fact(5));
	}
}
