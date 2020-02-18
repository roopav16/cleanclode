package task4.cleancode;
public class App 
{
    public static void main( String[] args )
    {
        Simple s=new Simple();
        System.out.println(s.calculateSI());
        Compound c=new Compound();
        System.out.println(c.calculateCI());
        //For House Construction reading input
        System.out.println("Select your Material Standards:\n 1.Standard materials\n 2.Above standard materials\n 3.High Standard materials\n 4.FullyAutomated mode");
        HouseConstruction h=new HouseConstruction();
        System.out.println(h.construct());
    }
}