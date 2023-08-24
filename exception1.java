public class exception1
{
    public static void main(String[] args) 
    {
      int n1 = 8;
      int n2 = 0;
      int result=0;
      
       try
       {
        result = n1/n2;
        System.out.println("in try block");
       }
     catch(Exception e)
     {
       System.out.println("something went wrong"+e);
     }
     System.out.println("bye");
     System.out.println(result);
    }
}