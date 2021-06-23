import java.util.*;
public class valey {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int n = s.nextInt();
		int ele[] = new int[n];
		System.out.println("enter " +n +" Elements :");
		for (int i = 0; i<n; i++)
		{
			ele[i] = s.nextInt();
		}
		if(n==1)
		{
			System.out.println("False");
		   return ;
		}
		int i = 1;
		while(i<n)
		{
			if((ele[i-1]) > (ele[i]) )
			{
				i = i +1;
			}
			else
			{
			  break;	
			}
		}
		if( (i == n)  ||  (i == 1)  )
		{
			System.out.println("False");
			return;
		}
		while(i<n)
		{
			if(ele[i - 1] < ele[i])
			{
				i = i +1;
			}
			else
			{
				break;
			}
			
		}
		if(i <n)
		{	System.out.println("False");
		  return ;
		}
		
			System.out.println("True");
	}

}
