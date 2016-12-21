/**
 * This class runs a simulation of a specified amount of trials against the computer in blackjack
 * @author Joseph
 *
 */
public class GameSimulation {

	private int trials;
	private ComputerDeal computerHand;
	private PlayerStrategy playerHand;
	private int playerScore;
	private int computerScore;
	private double winRate;
	private Deck playDeck;
	/**
	 * the constructor creates a new deck, a computer hand and a player hand from the deck
	 * it also takes in the number of trials to run
	 * Then it runs the simulation
	 * @param t trials
	 */
	public GameSimulation(int t){
		trials =t;
		playDeck = new Deck();
		computerHand = new ComputerDeal(playDeck);
		playerHand = new PlayerStrategy(playDeck);
	}
	
	public double getWinRate(){
		return winRate;
	}
	
	/**
	 * This class runs the simulation and  calculates the players win rate
	 */
	
	public void runSimulation(){
		int wins = 0;
		for (int i = 0; i < trials; i++){
			boolean playerWin = false;
			playGame();
			playerWin = evaluate();
			if (playerWin){
				wins ++;
			}
			winRate = ((double) wins/trials);			
		}
	}
	
	private void playGame(){
		computerHand.computerStart();
		playerHand.playerStart();
		int dealerCard = computerHand.dealerCard();
		playerHand.playerHit(dealerCard);
		computerHand.computerHit();
		
		computerScore = computerHand.getDealerScore();
		playerScore = playerHand.getPlayerScore();
	}
	
	/**
	 * This class evaluates the player's Score and the computers score
	 * @return true if the player wins
	 */
	
	private boolean evaluate(){
		boolean victory = false;
		if (playerScore == 21){
			victory = true;
		}
		else if (playerScore > 21){
			victory = false;
		}
		else if (computerScore > 21){
			victory = true;
		}
		else if (playerScore > computerScore){
			victory = true;
		}
		else if (computerScore > playerScore){
			victory = false;
		}
		else if (computerScore == playerScore){
			victory = false;
		}
		return victory;
	}
}
