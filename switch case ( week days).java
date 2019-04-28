import java.util.Scanner;
public class MyClass 
{
    public static void main (String args[])
    {
         int day;
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a number from 0 - 6");
         day = sc.nextInt();
         if(day < 0 || day > 6)
         {
             System.out.println("Invalid week num");
             System.exit (0);
         }
         switch (day)
         {
            case 0: System.out.println("Sunday");
                    break;
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                     break;
            case 3: System.out.println("Wednesday");
                     break;
            case 4: System.out.println("Thursday");
                     break;
            case 5: System.out.println("Friday");
                     break;
            case 6: System.out.println("Saturday");
                     break;   
            default: System.out.println("Invalid");
                     break;
         }
    }
}