import java.util.Scanner;

public class Craps
	{
	public static void main(String[] args)
		{
			boolean stillRolling = true;
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "! " + "Welcome to Craps!");
			//CREATE NEW METHODS
			int die1=(int) (Math.random()*6)+1;
			int die2=(int) (Math.random()*6)+1;
			int diceTotal = die1 + die2;
			System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + diceTotal);
			
//			while (stillRolling)
				

			switch (diceTotal)
			{
				case 2:
				case 12:
						{
							System.out.println("Sorry, you loose!");
							break;
						}
				case 7:
				case 11:
						{
							System.out.println("You win!");
							break;
						}
				default:
					
								{
									System.out.println("Your point is " + diceTotal);
								}
						
			}
				
				while (stillRolling)
					{
						int die3=(int) (Math.random()*6)+1;
						int die4=(int) (Math.random()*6)+1;
						int diceTotal2 = die3 + die4;
						System.out.println("You rolled a " + die3 + " and a " + die4 + " for a total of " + diceTotal2);
						if (diceTotal2 == diceTotal)
							{
								System.out.println("You win! Great Job!");
								stillRolling = false;
							}
						else if (diceTotal2 == 7)
							{
							System.out.println("You lose!");
							stillRolling = false;
							}
					}
					
					
				
		
		}
	}
