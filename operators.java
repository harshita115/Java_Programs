public class MyClass 
{
    public static void main (String args[])
    {
        int a=5, b=7;
        String result;
        
        System.out.println ("a & b =" + (a & b));
        System.out.println ("a / b =" + (a / b));
        System.out.println ("a ^ b =" + (a ^ b));    
        System.out.println ("~ a =" + (~a));
        
        a&=b;
        System.out.println ("a =" + a);
        result = (a>b) ? "positive":"negative";
        System.out.println (a + " is " + result);
    }
}