/**
 * This class creates a hand for the computer
 * It also has methods for the start of the game and the computers strategy for a game of black jack
 * @author Joseph
 *
 */
public class ComputerDeal {
	
	private Hand computerHand;
	private int computerScore;
	
	/**
	 * Constructor creates the hand and the deck to deal from
	 * @param playDeck the deck to deal from
	 */
	
	public ComputerDeal(Deck playDeck){
		computerHand = new Hand(playDeck);
	}
	
	/**
	 * creates the computers hand for the start if the game
	 */
	
	public void computerStart(){
		computerHand.deal();
		computerHand.deal();
		computerScoreCount();
	}
	
	/**
	 * Deals to the computer should it want to hit
	 */
	
	
	public void computerHit(){
		while (computerScore < 17){
			computerHand.deal();
			computerScoreCount();
		}
	}
	
	/**
	 * counts the computers score
	 * initially counts ace as 11, 
	 * if that busts counts ace as 1
	 */
	
	public void computerScoreCount(){
		computerScore = computerHand.scoreCount();
		if (computerScore <= 21){
			computerScore = computerHand.scoreCount();
		}
		else if (computerScore > 21){
			computerScore = computerHand.aceAlternativeCount();	
		}

	}
	
	/**
	 * 
	 * @return computers score
	 */
	
	public int getDealerScore(){
		return computerScore;
	}
	
	/**
	 * prints the dealers hand
	 */
	
	public void showDealerHand(){
		computerHand.printHand();
	}
	
	/**
	 * prints a single card from the computers hand
	 * @param i index of the card to print
	 */
	
	public int dealerCard(){
		Card computerCard = computerHand.getCard(1);
		 return computerCard.getRank();
	}
	
	public void showDealerCard(int i){
		computerHand.printIndexCard(i);
	}
}