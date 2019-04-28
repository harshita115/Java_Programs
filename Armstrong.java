import java.util.Scanner;
public class MyClass
{
   public static void main(String args[])
   {		
	int num, number, temp, total = 0;
	System.out.print("Enter 3 digit number : ");
	Scanner scan = new Scanner (System.in);
	num = scan.nextInt();
	scan.close();
	number=num;
	for(; number != 0; number /=10)
	{
	    temp = number % 10;
	    total = total + temp*temp*temp;
	}
	if(total == num)
	  System.out.print(num + "is an Armstrong number");
	else
	  System.out.print(num + "is not Armstrong number");
   }
}