import java.util.Scanner;
public class IT24102296Lab7Q3
{
   public static void main(String[] args)
   {
     Scanner input=new Scanner(System.in);
     
     int n;
     double amount;
     double discount;
     double totalAmount;
     char type;

	for(n=1; n<=5; n++)
	{
	System.out.println("Customer "+n);
	
	System.out.print("Enter total bill amount:");
	amount=input.nextDouble();

	System.out.print("Enter mode of payment (C for cash, O for other): ");
	type=input.next().charAt(0);

	   if(type=='C')
	   {
	   discount=(amount*5.0/100.0);
	   totalAmount=(amount-discount);
	   System.out.println("Discount is : "+discount);
	   System.out.println("Amount to be paid: "+totalAmount);
	   System.out.println();
	   
	   }

	   else if(type=='O')
	   {
	   System.out.println("No discount applicable");
	 
	   System.out.println("Amount to be paid: "+amount);
	   System.out.println();
	   
	   }

	   else if(type=='c')
	   {
	   discount=(amount*5.0/100.0);
	   totalAmount=(amount-discount);
	   System.out.println("Discount is : "+discount);
	   System.out.println("Amount to be paid: "+totalAmount);
	   System.out.println();
	   }

	   else if(type=='o')
	   {
	   

	   System.out.println("No discount applicable");
	   
           System.out.println("Amount to be paid: "+amount);
	   System.out.println();
	   
	   }

	   else
	   {
	   System.out.println("Payment Mode is Not Valid");
	   System.out.println();
	   }
	}
   }
}

	   

	   
	   
	   
	
