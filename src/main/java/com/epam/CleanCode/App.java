package com.epam.CleanCode;
import java.util.Scanner;
public class App 
{
    
    public static void main( String[] args )
    {
    	Scanner s= new Scanner(System.in);
    	System.out.format("1.Calculate Compound Interest.\n" +
    					  "2.Calculate Simple Interest.\n" +
   						  "3.Calculate House Construction Cost.\n" +
   					  	  "Enter Your Choice: ");
   		int x = s.nextInt();
   		switch(x)
   		{
   			case 1:
   				System.out.format("\nAmount after Simple Interest is %.2f\n", Solve.input(x));
   				break;
   			case 2: 
   				System.out.format("\nAmount after Compound Interest is %.2f\n", Solve.input(x));
    			break;
    		case 3:
    			System.out.format("Your total cost will be " + Solve.ConstructionCost() +" INR\n\n" );
   				break;
    		default:
   				System.out.format("\nWrong Choice! \n");
   		}
    	s.close();
    	System.out.format("Program Closed. \n");
    }
}
