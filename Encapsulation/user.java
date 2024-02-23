package Encapsulation;

class A
{
	private int password;
	void setPass(int password)
	{
		this.password = password;
	}
	int getPass()
	{
		return password;
	}
}
class User
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		A obj = new A();
		System.out.print("Enter the password: ");
		obj.setPass(sc.nextInt());
		System.out.print("Re-Enter the password: ");
		int b = sc.nextInt();
		if(b==obj.getPass())
			System.out.print("Login Success");
		else
			System.out.println("Login Failed");
	}
}