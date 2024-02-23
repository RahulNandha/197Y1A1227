import java.util.*;
class A
{
    static Scanner in=new Scanner(System.in);
    static A ob=new A();
    private int passWord;
    void setter(int a)
    {
        this.passWord=a;
    }
    int getter()
    {
        return passWord;
    }
}
class User extends A
{
   int c=in.nextInt();
    public static void main(String[] args) {
        User ob1=new User();
        ob.setter(in.nextInt());
        int d=ob.getter();
        if(d==ob1.c)
        {
            System.out.println("login");
        }
        else{
            System.out.println("invalid");
        }
    }
}