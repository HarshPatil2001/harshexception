import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true)
        try
        {
        	int x;
        	System.out.println("enter the value of x:");
        	Scanner sc=new Scanner (System.in);
        	x=sc.nextInt();
        	int result=50/x; //raise exception
        	System.out.println("the result is="+result); 
        	break;
        }
        catch (ArithmeticException ae)
        {
        	System.out.println("can't divide by zero"); 
        }
		catch (InputMismatchException ie)
		{
			System.out.println("Divide only by integer values");
		}
		}
	}
	
        
        			
        			
        	


