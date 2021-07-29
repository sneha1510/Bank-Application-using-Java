package pack;

public class Transaction 
{
	//System.out.println("1-withdraw\n2-deposite");
	//System.out.println("Enter your choice..");
	//int c=sc.nextInt();
	//int b=0;
	//if(c==1)
	//{
	public void withdraw(Account a,int amt)
	{
		//int w=sc.nextInt();
		if(a.getAccbal()<1000)
		{
			System.out.println("Sorry u cant withdraw amount because balance is than 1000");
		}
		else
		{
      int bal=a.getAccbal()-amt;
      a.setAccbal(bal);
	 System.out.println("Trasaction Completed successfully...");
	 System.out.println("After the trasaction your balance is:"+a.getAccbal());
	}
	}
	public void dep(Account a,int amt)
	{
		//int w=sc.nextInt();
      int bal=a.getAccbal()+amt;
      a.setAccbal(bal);
	 System.out.println("Trasaction Completed successfully...");
	 System.out.println("After the trasaction your balance is:"+a.getAccbal());
	}
	//Trasaction t=new Trasaction();
	
	
	

}
