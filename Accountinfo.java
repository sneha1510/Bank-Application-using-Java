package pack;

import java.util.*;
public class Accountinfo 
{
	Scanner sc=new Scanner(System.in);
	public Customer[] create()
	{
		System.out.println("How many account no. do u want...?");
		int n=sc.nextInt();
	//	Account arr[]=new Account[n];customer cha array kra
		Customer c[]=new Customer[n];
		for(int i=0;i<n;i++)
		{

			System.out.println("Enter the details for Account");
		System.out.println("Enter the account no: ");
		int acno=sc.nextInt();
		System.out.println("Enter the account type: ");
		String atype=sc.next();
		System.out.println("Enter the account balance: ");
		int abal=sc.nextInt();
      Account a=new Account(acno, atype, abal);

		System.out.println("=============================");
		System.out.println("enter customer id:");
		int id=sc.nextInt();
		System.out.println("enter customer name:");
		String name=sc.next();
		System.out.println("enter customer mobile no:");
		String mobno=sc.next();
      Customer c1=new Customer(id,name,mobno,a);
         c[i]=c1;
    		  
		}
		return c;
	}
	public void display(Customer c[])
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("                         Details of Customers                ");
		System.out.println("------------------------------------------------------");
		System.out.println("\t\tCustomer id\t\tCustomer name\t\tCustomer mobile no");
		for(Customer a1:c )
		{
			System.out.println("\t\t\t"+a1.getId()+"\t\t\t"+a1.getName()+"\t\t\t"+a1.getMobno());

		}
        System.out.println("---------------------------------------------------------");
		System.out.println("                          Details of Account                    ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t\tAccount no\t\tAccount type\t\tAccount balance");
		System.out.println("------------------------------------------------------------");


		for(Customer a1:c )
		{
			//System.out.println("====Details of Account=======");
			//System.out.println("Account no\t\tAccount type\t\tAccount balance");
			System.out.println("\t\t\t"+a1.getA().getAccno()+"\t\t\t"+a1.getA().getacctype()+"\t\t\t"+a1.getA().getAccbal());
		
			//System.out.print("========================");
			
		}
		

		
	}
/*	public void search(Customer c[])
	{
	 int flag=0;
     
	//	for(Account a:a1)
		//{
		//	if(aobj.getAccno()==accno)
		//	{
			   //  flag=1;
				System.out.println("Account found");
				System.out.println("Account no:"+c.+"\n"+"account balance:"+aobj.getAccbal()+"\n"+"Account type:"+aobj.getacctype());
				System.out.println("1-withdraw\n2-deposite");
				System.out.println("Enter your choice..");
				int c=sc.nextInt();
				int b=0;
				if(c==1)
				{
					System.out.println("Enter amount to withdraw");
					//int bal=a.getAccbal();
					int w=sc.nextInt();
			      int finalbal=aobj.getAccbal()-w;
				   aobj.setAccbal(finalbal);
				 System.out.println("Trasaction Completed successfully...");
				 System.out.println("After the trasaction your balance is:"+aobj.getAccbal());
				}
				//Trasaction t=new Trasaction();				
			//	aobj=a;
		//	break;
			//}
		//}
	//	if(flag!=1)
		//{
		//	System.out.println("Account no is not found...");
	//	}
		//return aobj;
	}
	
/*	public void tra(Account a1[])

	{
		Account a=new Account();
		System.out.println("Enter account no. for trasactions..");
		int ano=sc.nextInt();
		/*for(int i=0;i<a1;i++)
		{
			if(ano==a.getAccbal())
			{
				System.out.println("current balance in your account is:"+a.getAccbal());
			}
		}*/
	//	Account x=search(ano,a1);
	/*	System.out.println("1-withdraw\n2-deposite");
		System.out.println("Enter your choice..");
		int c=sc.nextInt();
		int b=0;
		if(c==1)
		{
			System.out.println("Enter amount to withdraw");
			//int bal=a.getAccbal();
			int w=sc.nextInt();
	      int finalbal=a.getAccbal()-w;
		   a.setAccbal(finalbal);
		 System.out.println("Trasaction Completed successfully...");
		 System.out.println("After the trasaction your balance is:"+a.getAccbal());
		}
		//Trasaction t=new Trasaction();	
		
	}*/
	public void trasactions(Customer cust[],int custid)
	{
		//int f=0;
        boolean b=false;
        Customer cobj=null;
        for(int i=0;i<cust.length;i++) 
        {
        	if(cust[i].getId()==custid)
        	{
        		b=true;
        		cobj=cust[i];
        		break;
        	}
        	
        }
        if(b)
        {
		Transaction t=new Transaction();
		System.out.println("1-withdraw\n2-deposite");
		System.out.println("Enter your choice..");
		int c=sc.nextInt();
   
 
		if(c==1)
		{
		System.out.println("current balance is:"+cobj.getA().getAccbal());
			System.out.println("Enter amount to withdraw");
			int amt=sc.nextInt();
			t.withdraw(cobj.getA(),amt);
			//break;
		}
		else if(c==2)
		{
			System.out.println("current balance is:"+cobj.getA().getAccbal());			System.out.println("Enter amount to deposite");
			int amt1=sc.nextInt();
			t.dep(cobj.getA(), amt1);
            // break; 
		}
        }
        else
        {
        	System.out.println("Invalid id...");
        }
  
	
		
   }	
		

	
}

 