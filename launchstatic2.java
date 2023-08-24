class demo
{
    static void disp()
    {
        System.out.println("Rahul");
    }
    static void disp2()
    {
        System.out.println("Nandha");
    }
    public class launchstatic2
    {
        public static void main(String[] args) 
        {
          demo.disp();
          demo d =new demo();
          demo.disp2();    
        }
    }
}
