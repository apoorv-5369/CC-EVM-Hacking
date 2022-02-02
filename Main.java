import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0){
		    int a =  sc.nextInt();
		    int b = sc.nextInt();
		    int c =  sc.nextInt();
		    int p =  sc.nextInt();
		    int q =  sc.nextInt();
		    int r =  sc.nextInt();
		    if((a+b+c)>(p+q+r)/2) System.out.println("Yes");
		    else if((p+b+c)>(p+q+r)/2 ) System.out.println("Yes");
		    else if((a+q+c)>(p+q+r)/2 ) System.out.println("Yes");
		    else if((a+b+r)>(p+q+r)/2 ) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
