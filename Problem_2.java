import java.util.Scanner;

public class Problem_2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the value of X");
		int X=s.nextInt();
		for(int i=1; i<=X; i++)
		{
			int a=i+(i-1);
            System.out.print(a+",");
		}
	}

}