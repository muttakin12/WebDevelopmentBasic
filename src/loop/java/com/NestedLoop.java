package loop.java.com;

public class NestedLoop {

	public static void main(String args[])
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i + "First loop");
			
			for(int j = 1; j<=5; j++)
			{
				System.out.println(j + "Second loop");
			}
		}
	}
}
