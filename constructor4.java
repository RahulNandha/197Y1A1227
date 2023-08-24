class constructorA
{
    private String name;
    private int age;

    public constructorA()
    {
        System.out.println("rahul");
        name="Nandha";
        age = 18;
    }
    public constructorA(String name)
    {
        this.name = name;
        age = 19;
    }
    public constructorA(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
class constructor4
{
    public static void main(String[] args) 
    {
        constructorA a = new constructorA(null, 0);
        a.disp();
        constructorA b = new constructorA("Nandha");
        b.disp();
        constructorA c = new constructorA("Vorrela",19);
        c.disp();
    }
}
