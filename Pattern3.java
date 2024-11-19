package Jeevitha;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1;i--)   //rows
		{
			for(int k=5;i<=k;k--)
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++) //stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
