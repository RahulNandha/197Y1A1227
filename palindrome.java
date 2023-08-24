public class palindrome
{
    public static void main(String[] args) 
    {
       String str1 = "markram";
       String str2 = " ";
       {
         for(int i=str1.length()-1; i>=0; i--)
         {
            str2=str2+str1.charAt(i);
         }
       }
     if(str1.equals(str2))
     {
        System.out.print("it is a palindrome");
     }
     else
     {
        System.out.print("it is not a palindrome");
     }
    }
}