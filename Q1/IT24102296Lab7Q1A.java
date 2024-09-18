import java.util.Scanner;
public class IT24102296Lab7Q1A
{
public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  
  int sum,mark;
  double average;
  int count=1;
  sum=0;

  System.out.println("Enter marks for four subjects :");
  
  while(count<=4)
  {
  System.out.print("Enter Subject Mark "+count+":");
  mark=input.nextInt();

  count=count+1;
  sum+=mark;
  }

   average=sum/4.0;
   System.out.print("Average is :"+average);

   if(average>=75 && average<=100)
   {
   System.out.println("Overall Grade is : Distinction");
   }
   else if(average>=50 && average<=74)
   {
   System.out.println("Overall Grade is : Credit");
   }
   else
   {
   System.out.println("Overall Grade is : Distinction");
   }
}
}
   
   



  
