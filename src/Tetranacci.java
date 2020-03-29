
public class Tetranacci 
{
   public static int Tetranacci(int n)
   {
	   if(n<0)
		   System.exit(0);
	   if(n<=2)
		   return 0;
	   if(n==3)
		   return 1;
	   else
	   {
		   return Tetranacci(n-1)+Tetranacci(n-2)+Tetranacci(n-3)+Tetranacci(n-4);		   
	   }
   }
   public static void main(String[] args)
   {
	   long startTime1=System.currentTimeMillis();
	   System.out.println("The 5th Tetranacci is: "+Tetranacci(5));
	   long endTime1=System.currentTimeMillis();
	   System.out.println("Time spent(5) is: "+(endTime1-startTime1));
	   System.out.println();	   	
	   
	   long startTime2=System.currentTimeMillis();
	   System.out.println("The 7th Tetranacci is: "+Tetranacci(7));
	   long endTime2=System.currentTimeMillis();
	   System.out.println("Time spent(7) is: "+(endTime2-startTime2));
	   System.out.println();
	   
	   
	   long startTime3=System.currentTimeMillis();
	   System.out.println("The 10th Tetranacci is: "+Tetranacci(10));
	   long endTime3=System.currentTimeMillis();
	   System.out.println("Time spent(10) is: "+(endTime3-startTime3));
	   System.out.println();
	 
	   long startTime4=System.currentTimeMillis();
	   System.out.println("The 15th Tetranacci is: "+Tetranacci(15));
	   long endTime4=System.currentTimeMillis();
	   System.out.println("Time spent(15) is: "+(endTime4-startTime4));
	   System.out.println();
	   
	   long startTime5=System.currentTimeMillis();
	   System.out.println("The 20th Tetranacci is: "+Tetranacci(20));
	   long endTime5=System.currentTimeMillis();
	   System.out.println("Time spent(20) is: "+(endTime5-startTime5));
	   System.out.println();
	   
	   long startTime6=System.currentTimeMillis();
	   System.out.println("The 25th Tetranacci is: "+Tetranacci(25));
	   long endTime6=System.currentTimeMillis();
	   System.out.println("Time spent(25) is: "+(endTime6-startTime6));
	   System.out.println();
	   
	   long startTime7=System.currentTimeMillis();
	   System.out.println("The 30th Tetranacci is: "+Tetranacci(30));
	   long endTime7=System.currentTimeMillis();
	   System.out.println("Time spent(30) is: "+(endTime7-startTime7));
	   System.out.println();
	   
	   long startTime8=System.currentTimeMillis();
	   System.out.println("The 35th Tetranacci is: "+Tetranacci(35));
	   long endTime8=System.currentTimeMillis();
	   System.out.println("Time spent(35) is: "+(endTime8-startTime8));
	   System.out.println();
   }
}
