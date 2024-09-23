import java.util.Scanner;
public class IT24102296Lab7Q1B
{
   public static void main(String[] args)
   {
     Scanner input=new Scanner(System.in);

     int mark1,mark2,mark3,mark4,n,sum;
     double average;
     sum=0;

     for(n=1; n<=3; n++)
     {
     System.out.println("Student "+n);
     
     System.out.print("Enter marks : ");
	
	mark1=input.nextInt();
	mark2=input.nextInt();
	mark3=input.nextInt();
	mark4=input.nextInt();
	
	sum=mark1+mark2+mark3+mark4;
	
	
	average=sum/4.0;
	System.out.println("Average is :"+average);

	if(average<=100 && average>=75)
	{
	System.out.println("Overall Grade is : Distinction");
	}
	else if(average<=74 && average>=50)
	{
	System.out.println("Overall Grade is : Credit");
	}
	else
	{
	System.out.println("Overall Grade is : Fail");
	}
	System.out.println();
     }
   }
}


	

	

    