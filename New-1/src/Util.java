import java.util.Scanner;

public class Util 
{
	static Scanner sc = new Scanner(System.in);
	public static int inputInt()
	{
		System.out.println("enter value ");
		int num = sc.nextInt();
		return num;
	}
	static double[][] doublevar(int cols, int row)
	{
		System.out.println("enter element of array in double ");
		double[][] array2 = new double[cols][row];  
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				array2[i][j] = sc.nextDouble();
			}
		}
		return array2;
	}
	static int[][] intvar(int cols, int row)
	{
		System.out.println("enter element of array in integer");
		int[][] array1 = new int[cols][row];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				array1[i][j] = sc.nextInt();
			}
		}
		return array1;
	}
	static String[][] stringvar(int cols, int row)
	{
		System.out.println("enter element of array in integer");
		String[][] array3 = new String[cols][row];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				array3[i][j] = sc.next();
			}
		}
		return array3;
	}
	 //This function calculate the wins and bets
    public static int gambler(int stake,int goal,int trials)
    {
    
    	int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won 
    
      //repeat trials times
    
    for (int t = 0; t < trials; t++) {

        
         // do one gambler's ruin simulation
         
        int cash = stake;
        while (cash > 0 && cash < goal) {
            bets++;
            
            if (Math.random() < 0.5)
            	cash++;     // win $1
            else                    
            	cash--;     // lose $1
        }
        if (cash == goal) 
        	wins++;                // did gambler go achieve desired goal?
        return wins;   //return number of wins
    }
	return bets; //returns no of bets made
	
    }


}
