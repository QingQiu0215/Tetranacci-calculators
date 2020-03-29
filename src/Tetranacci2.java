
public class Tetranacci2 
{
   public static long[] Tetranacci(int k)
   {
	   if(k<3)
		   System.exit(0);
	   if(k<=3)
	   {
		   long [] answer={1,0,0,0};
		   return answer;
	   }
	   else
	   {
		   long [] temp=Tetranacci(k-1);
		   long [] answer={temp[3]+temp[2]+temp[1]+temp[0],temp[0],temp[1],temp[2]};
		   return answer;
	   }
   }
   public static void main(String[] args)
   {	      
	   long startTime1=System.currentTimeMillis();
	   System.out.println("The 5th Tetranacci is: "+Tetranacci(5)[0]);
	   long endTime1=System.currentTimeMillis();
	   System.out.println("Time spent(5) is: "+(endTime1-startTime1));
	   System.out.println();
	   long startTime2=System.currentTimeMillis();
	   System.out.println("The 10th Tetranacci is: "+Tetranacci(10)[0]);
	   long endTime2=System.currentTimeMillis();
	   System.out.println("Time spent(10) is: "+(endTime2-startTime2));
	   System.out.println();
	   long startTime3=System.currentTimeMillis();
	   System.out.println("The 30th Tetranacci is: "+Tetranacci(30)[0]);
	   long endTime3=System.currentTimeMillis();
	   System.out.println("Time spent(30) is: "+(endTime3-startTime3));
	   System.out.println();
	   long startTime4=System.currentTimeMillis();
	   System.out.println("The 60th Tetranacci is: "+Tetranacci(60)[0]);
	   long endTime4=System.currentTimeMillis();
	   System.out.println("Time spent(60) is: "+(endTime4-startTime4));
	   System.out.println();
	   long startTime5=System.currentTimeMillis();
	   System.out.println("The 100th Tetranacci is: "+Tetranacci(100)[0]);
	   long endTime5=System.currentTimeMillis();
	   System.out.println("Time spent(100) is: "+(endTime5-startTime5));
	   System.out.println();
	   long startTime6=System.currentTimeMillis();
	   System.out.println("The 500th Tetranacci is: "+Tetranacci(500)[0]);
	   long endTime6=System.currentTimeMillis();
	   System.out.println("Time spent(500) is: "+(endTime6-startTime6));
	   System.out.println();
   }
}
