class demo
{
    private int a;
    private int b;

    demo()
    {
        System.out.println("Rahul Nandha");
    }
    demo(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class constructor2
{
    public static void main(String[] args) 
    {
        demo d = new demo();
        d.disp();
        demo d2 = new demo(25, 62);
        d2.disp();    
    }
}