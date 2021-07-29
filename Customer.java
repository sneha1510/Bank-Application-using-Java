package pack;

public class Customer
{
	int id;
	String name;
	String mobno;
	Account a;
	public Customer()
	{
		
	}
	public Customer(int id, String name, String mobno,Account a) {
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.a=a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}
	

}
