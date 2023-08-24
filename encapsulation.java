class st
{
    private int age;
    private String name;
    public void setData()
    {
        age=18;
        name="Rahul";
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
}
class encapsulation
{
    public static void main(String[] args) 
    {
        st s = new st();
        s.setData();
        s.show();    
    }
}