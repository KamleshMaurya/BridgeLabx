
public class Gambler 
{
	public static void main(String args[])
	{
		 // Enter the value of stake,goals,trails
		 Util u = new Util();
		System.out.print("stake ");
		int stake=u.inputInt();
		System.out.print("goals ");
		int goal=u.inputInt();
		System.out.print("trails ");
		int trials=u.inputInt();
		// print results
		int wins = u.gambler(stake, goal, trials);
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        int bets = u.gambler(stake, goal, trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		
		
	}

}
