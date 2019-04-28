public class Constructor
{
   int x,y;
   Constructor()
   {
       System.out.println("Default Constructor");
   }
   Constructor(int a, int b)
   {
       x=a; 
       y=b;
       System.out.println("Parameterised Constructor");
       System.out.println("A = " + a + " B = " + b);
   }
   Constructor (Constructor d)
   {
       this.x = d.x;
       this.y = d.y;
       System.out.println("Copy Constructor X = " + x+" Y = "+y);
   }
   public static void main(String args[])
   {
     Constructor d = new Constructor ();
     Constructor d1 = new Constructor (10,20);
     Constructor d2 = new Constructor (d1);
   }
}