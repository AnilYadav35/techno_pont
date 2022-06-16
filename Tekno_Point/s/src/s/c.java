package s;

import java.util.ArrayList;
import java.util.Scanner;

public class c {
	
	
	

	
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);

			double no1, no2;
			String sym, yn=null;
			ArrayList<Double> calculations = new ArrayList();

			do
			{
				try
				{
				
				
				System.out.println("Enter symbol (+,-,*,/)");
				sym=s.next();	

				switch(sym)
				{
					 
				case "+":
					  System.out.println("Enter 1st No.");
					  no1=s.nextDouble();		

					  System.out.println("Enter 2nd No.");
					  no2=s.nextDouble();
					
					  System.out.println("Addition is : "+(no1+no2));
				      calculations.add(no1 + no2);
					  break;
				case "-":
					  System.out.println("Enter 1st No.");
					  no1=s.nextDouble();		

					  System.out.println("Enter 2nd No.");
					  no2=s.nextDouble();
					  System.out.println("Subtraction is : "+(no1-no2));
					  calculations.add(no1 -no2);
					  break;
				case "*": 
					  System.out.println("Enter 1st No.");
					  no1=s.nextDouble();		

					  System.out.println("Enter 2nd No.");
					  no2=s.nextDouble();
					  System.out.println("Multiplication is : "+(no1*no2));
					  calculations.add(no1 * no2);
					  break;
				case "/": 
					  System.out.println("Enter 1st No.");
					  no1=s.nextDouble();		

					  System.out.println("Enter 2nd No.");
					  no2=s.nextDouble();
					  System.out.println("Division is : "+(no1/no2));
					  calculations.add(no1 /  no2);
					  break;
				case "his":
					 	System.out.println("Here are the calculations you have done so far: ");
					    for (int i = 0; i < calculations.size(); i++)
					    {
					      System.out.println(calculations.get(i));
					      
					    }
					    break;
				default: 
					 System.out.println("Invalid Symbol");
					 break;
	
						
						
				}

				System.out.println("DO you want to continue (Press y for Yes or n for no)");
				yn=s.next();
				System.out.println("-----------------------------------------");
			}
				catch(Exception e)
				{
					System.out.println("Can not divied by zero");
				}
			}
			while(yn.equals("y") || yn.equals("Y"));		
		}
	}


