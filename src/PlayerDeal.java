import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class constructs a hand for the player
 * It also prompts the user to hit or stay as well as counting the score
 * @author Joseph
 *
 */
public class PlayerDeal {
	private Hand playerHand;
	private int playerScore;
	
	/**
	 * The constructor creates a hand using the deck in play
	 * @param playDeck
	 */
	public PlayerDeal(Deck playDeck){
		playerHand = new Hand(playDeck);
	}
	
	/**
	 * The players first two deals and tells the player their cards and score
	 */
	
	public void playerStart(){
		System.out.println("Your first cards are ");
		playerHand.deal();
		playerHand.deal();
		scoreCount();
		playerHand.printHand();
		System.out.println("Your score is " + playerScore);
	}
	
	/**
	 * This class prompts the user whether they would like to hit or stay
	 */
	
	public void stillPlay(){
		System.out.println("Would you like to hit or stay?");
		Scanner in = new Scanner(System.in);
		String hit = in.nextLine();
		while (hit.equalsIgnoreCase("hit")){
			hit();
			if (playerScore <= 21){
				System.out.println("would you like to hit or stay?");
				hit = in.nextLine();
			}
			else {
				hit = "stay";
			}
		}
	}
	
	/**
	 * This class deals a card to the player upon requesting a hit
	 * It recalculates their score an prints it out
	 */
	
	private void hit(){
		playerHand.deal();
		scoreCount();
		int index = playerHand.getSize() - 1;
		System.out.println("You get a ");
		playerHand.printIndexCard(index);
		System.out.println("Your new score is " + playerScore);
	}
	
	/**
	 * Counts the player score
	 * If the score is over 21 it counts aces as 1
	 */
	public void scoreCount(){
		playerScore = playerHand.scoreCount();
		if (playerScore > 21){
			playerScore = playerHand.aceAlternativeCount();
			
		}
	}
	
	/**
	 * 
	 * @return player score
	 */
	
	public int getScore(){
		return playerScore;
	}
	
	/**
	 * prints the players hand
	 */
	
	public void showPlayerHand(){
		playerHand.printHand();
	}
}
