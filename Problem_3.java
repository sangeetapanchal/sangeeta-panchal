import java.util.Scanner;

import java.util.Scanner;

public class Problem_3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the value of X");
		int X=s.nextInt();
		if(X%2==0)
		{
		    for(int i=1; i<=X; i++)
		    { 
				if(i<=X-1)
				{
			      int a=(2*i)-1;
			       System.out.println(a+",");
			    }
		    }
	    }
		else
		{
			for(int i=1; i<=X; i++)
		    {
			  int a=(2*i)-1;
			  System.out.println(a+",");
		    }
		}
	}
}

