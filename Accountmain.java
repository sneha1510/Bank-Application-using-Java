package pack;
import java.util.*;
public class Accountmain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Accountinfo ainfo=new Accountinfo();
		Customer cust[]=null;
			cust=ainfo.create();
		ainfo.display(cust);
		System.out.println("-----------------------------------------------------------------");

		System.out.println("do u want to perform trasactions press 1");
		System.out.println("-----------------------------------------------------------------");

		int ch=sc.nextInt();
		if(ch==1)
		{
	            System.out.println("enter customer id for trasactions");
	            int custid=sc.nextInt();
	            ainfo.trasactions(cust, custid);
		}
		System.out.println("--------------------------thank u---------------------------------------");

	
     }
}



