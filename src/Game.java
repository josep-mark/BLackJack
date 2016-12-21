import java.util.Scanner;
/**
 * This class runs a game between the player and computer
 * It runs a computer hand and a player hand from the same deck
 * Then it compares the dealers score to the players score to choose a winner
 * @author Joseph
 *
 */

public class Game {
	private ComputerDeal dealer;
	private PlayerDeal player;
	private Deck playDeck;
	private int dealerScore;
	private int playerScore;

	/**
	 * Constructor creates a computer hand and player hand using the same deck
	 */
	
	public Game(){
		playDeck = new Deck();
		dealer = new ComputerDeal(playDeck);
		player = new PlayerDeal(playDeck);
	}
	
	/**
	 * The playgame method deals cards initially to the computer and player
	 * it then runs each of their methods or playing
	 * then it compares the score
	 */
	
	public void playGame(){
		
		dealer.computerStart();
		System.out.println("The dealer shows ");
		dealer.showDealerCard(1);
		
		player.playerStart();
		
		player.stillPlay();
		
		if (player.getScore() <21) {
		dealer.computerHit();
		}
		
		playerScore = player.getScore();
		System.out.println("Your Score is " + playerScore);
		dealerScore = dealer.getDealerScore();
		System.out.println("The dealers hand is ");
		dealer.showDealerHand();
		System.out.println("The dealer scored " + dealerScore);
		
		if (playerScore == 21){
			System.out.println("Congratulations on your victory");
			
		}
		else if (playerScore > 21) {
			System.out.println("Bust!");
		}
		else if (dealerScore > 21){
			System.out.println("The dealer busts");
		}
		else if (playerScore > dealerScore){
			System.out.println("Wooooow you beat the dealer");
		}
		else if (dealerScore > playerScore){
			System.out.println("The house wins");
		}
		else if (dealerScore == playerScore){
			System.out.println("Its a tie!");
		}
	}
}