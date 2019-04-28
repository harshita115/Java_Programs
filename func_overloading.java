public class MyClass 
{
  public int MyClass (int x, int y)
  {
      return (x+y);
  }
  public int MyClass (int x, int y, int z)
  {
      return (x+y+z);
  }
  public double MyClass (double b, double a)
  {
      return (a+b);
  }
  public static void main(String []args) 
  {
     MyClass s = new MyClass ();
     System.out.println (s.MyClass (10,20));
     System.out.println (s.MyClass (5,20,15));
     System.out.println (s.MyClass (10.0,10.5));
  }
}