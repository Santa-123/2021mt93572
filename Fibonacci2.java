class Fibonacci2
{
	public static void main(String[] args)
	{
		//program to print the fibonacci series
		int a=0,b=1,n=8,c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n-2;i++)
		{
			c=a;
			a=b;
			b=a+c;
			System.out.println(b);
		}
	}
}
