import java.util.*;
interface Colors 
{
   	static String def = "\u001B[0m";
    	static String blink = "\u001B[5m";
    	static String red = "\u001B[31m";
	static String white="\u001B[37m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
	static String bold="\u001B[1m";
    	static String purple = "\u001B[35m";
    	static String skblue = "\u001B[36m";
	static String cyan = "\u001B[36m";
	static String reset="\u001B[0m";
	static String magent = "\u001B[95m";
}
class bus implements Colors
{
	static Scanner sc=new Scanner(System.in);
	static double hyderabad=500;
	static double amalapuram=300;
	static double eluru=400;
	static double guntur=700;
	static int tax=50;
	static int gst=35;
	static int otpgen()
  	{
  		  int otp=1000+(int)(Math.random()*8999);
  		  return otp;
  	}
	static int message(int otp)
  	{
		  System.out.println(otp);
		  return otp;
  	}
	static void location()
	{
		System.out.println(magent+"select the boarding point\n1-hyderabad\n2-amalapuram\n3-eluru\n4-guntur"+reset);
		int n=sc.nextInt();
		System.out.println(magent+"select the dropping point\n1-hyderabad\n2-amalapuram\n3-eluru\n4-guntur"+reset);
		int n1=sc.nextInt();
		System.out.println("Select the date");
		System.out.print("\n\t\t 1 2 3 4 5 6 7 \n\t\t 8 9 10 11 12 13 14 \n\t\t 15 16 17 18 19 20 21 \n\t\t 22 23 24 25 26 27 28 \n\t\t 29 30 31 \n");
     		int h=sc.nextInt();
		System.out.println("SELECT YOUR PREFERRED BUS:");
     		System.out.println("1 for A.C Bus \n 2 for NON A.C Bus");
		int g=sc.nextInt();
		if(g==1)
		{
			System.out.println(yellow+"\n\t\t\t\tTHE BUSES AVAILABLE ARE:");
      			System.out.println("\n\t\t\t\t\t   S.NO  NAME               TYPE    TIMINGS");
      			System.out.println("\n\t\t\t\t\t   1.    SR travels         A.C     10:30 PM");
			System.out.println("\n\t\t\t\t\t   2.    SIRI travels       A.C     09:00 PM");
			System.out.println("\n\t\t\t\t\t   3.    KVR travels        A.C     09:45 PM");
      			System.out.println("\n\t\t\t\t\t   4.    ORANGE travels     A.C     10:50 PM");
		}
		else
		{
			System.out.println(yellow+"\n\t\t\t\tTHE BUSES AVAILABLE ARE:");
      			System.out.println("\n\t\t\t\t\t   S.NO  NAME               TYPE    TIMINGS");
      			System.out.println("\n\t\t\t\t\t   1.    SR travels         A.C     10:30 PM");
			System.out.println("\n\t\t\t\t\t   2.    SIRI travels       A.C     09:00 PM");
			System.out.println("\n\t\t\t\t\t   3.    KVR travels        A.C     09:45 PM");
      			System.out.println("\n\t\t\t\t\t   4.    ORANGE travels     A.C     10:50 PM");
		}
		System.out.println(reset+"Select the preferred bus");
		int aa=sc.nextInt();
		if(n==1 && n1==2)
		{
			details();
			System.out.println("your journey details "+h+" and boarding point is hyderabad and dropping location is amalapuram");	
			System.out.println("total amount="+(hyderabad+amalapuram+gst+tax));
			System.out.println("breakup amount:"+(hyderabad+amalapuram)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==1 && n1==3)
		{
			details();
			System.out.println("your journey details "+h+" and boarding point is hyderabad and dropping location is eluru");
			System.out.println("total amount="+(hyderabad+eluru+gst+tax));
			System.out.println("breakup amount:"+(hyderabad+eluru)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==1 && n1==4)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is hyderabad and dropping location is guntur");
			System.out.println("total amount="+(hyderabad+guntur+gst+tax));
			System.out.println("breakup amount:"+(hyderabad+guntur)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==2 && n1==1)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is amalapauram and dropping location is hyderabad");
			System.out.println("total amount="+(amalapuram+hyderabad+gst+tax));
			System.out.println("breakup amount:"+(amalapuram+hyderabad)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==2 && n1==3)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is amalapauram and dropping location is eluru");
			System.out.println("total amount="+(amalapuram+eluru+gst+tax));
			System.out.println("breakup amount:"+(amalapuram+eluru)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==2 && n1==4)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is amalapauram and dropping location is guntur");
			System.out.println("total amount="+(amalapuram+guntur+gst+tax));
			System.out.println("breakup amount:"+(amalapuram+guntur)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==3 && n1==1)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is eluru and dropping location is hyderabad");
			System.out.println("total amount="+(eluru+hyderabad+gst+tax));
			System.out.println("breakup amount:"+(eluru+hyderabad)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==3 && n1==2)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is eluru and dropping location is amlapuram");
			System.out.println("total amount="+(eluru+amalapuram+gst+tax));
			System.out.println("breakup amount:"+(eluru+amalapuram)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==3 && n1==4)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is eluru and dropping location is eluru");
			System.out.println("total amount="+(eluru+eluru+gst+tax));
			System.out.println("breakup amount:"+(eluru+eluru)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==4 && n1==1)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is guntur and dropping location is hyderabad");
			System.out.println("total amount="+(guntur+hyderabad+gst+tax));
			System.out.println("breakup amount:"+(guntur+hyderabad)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else if(n==4 && n1==2)
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is guntur and dropping location is amlapuram");
			System.out.println("total amount="+(guntur+amalapuram+gst+tax));
			System.out.println("breakup amount:"+(guntur+amalapuram)+"tax:"+tax+"gst:"+gst);
			payment();
		}
		else
		{
			details();
			System.out.println("your journey details "+h+"th and boarding point is guntur and dropping location is eluru");
			System.out.println("total amount="+(guntur+eluru+gst+tax));
			System.out.println("breakup amount:"+(guntur+eluru)+"tax:"+tax+"gst:"+gst);
			payment();
		}
	}
	static void payment()
	{
		int pin=9510;
		System.out.println("\n\t\t\t\t\t   Select the mode of payment\n\t\t\t\t\t   1-UPI payment\n\t\t\t\t\t   2-debit crad");
		int n1=sc.nextInt();
		if(n1==1)
		{
			System.out.println("Enter the UPI address(14 characters):");
			String s1=sc.next();
			System.out.println("Enter the UPI pin");
			int a2=sc.nextInt();
			if(a2==pin)
			{
				System.out.println("Loading.....");
				System.out.println("Transaction successful");
			}
			else
			{
				System.out.println("Invalid upi pin");
				payment();
			}			
		}
		else
		{
			System.out.println("Enter the card number: ");
			String a12=sc.next();
			System.out.println("Enter the CVV: ");
			int a13=sc.nextInt();
			System.out.println("Enter the Otp sent to the registered mobile number: ");
			otp();
		}
	}
		static void otp()
		{
			System.out.println("OTP generated");
			System.out.println("your otp is:  ");
			int otp=message(otpgen());
			System.out.println("Enter the otp: ");
			int otp1=sc.nextInt();
			if(otp==otp1)
			{
				System.out.println("Loading.....");
				System.out.println("Transaction successful");
			}
			else
			{
				System.out.println("Invalid OTP\nplease try again");
				otp();
			}
		}
	static void details()
	{
		System.out.println("Enter the no of passengers");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			System.out.println("Enter the Passenger name");
			String s1=sc.next();
			System.out.println("Enter the Age");
			int a0=sc.nextInt();
			System.out.println("Enter the Gender");
			String s2=sc.next();
		}
	}
	public static void main(String[]args)
	{
		System.out.printf("%50s\n",blink+red+"Welcome to Ticket Resesrvation"+reset);
		location();
	}
}
