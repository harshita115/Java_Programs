class car
{
    public car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle type : car");
    }
}
class Maruti extends car
{
    public Maruti()
    {
        System.out.println("Class Maruti");
    }
    public void brand()
    {
        System.out.println("Brand Maruti");
    }
    public void speed()
    {
        System.out.println("Max:90kmph");
    }
}
public class Maruti800 extends Maruti
{
    public Maruti800()
    {
        System.out.println("Maruti Model : 800");
    }
    public void speed()
    {
        System.out.println("Max : 80 kmph");
    }
    public static void main (String args[])
    {
        Maruti800 obj = new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}