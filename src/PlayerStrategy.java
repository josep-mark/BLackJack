/**
 * This class creates a strategy for an automated player to follow
 * it creates the players hand and has the hit algorithm
 * @author Joseph
 *
 */
public class PlayerStrategy {
	
	private Hand playerHand;
	private int playerScore;
	
	public PlayerStrategy(Deck playDeck){
		playerHand = new Hand(playDeck);
	}
	
	public void playerStart(){
		playerHand.deal();
		playerHand.deal();
		scoreCount();
	}
	
	private void scoreCount(){
		playerScore = playerHand.scoreCount();
		if (playerScore > 21){
			playerScore = playerHand.aceAlternativeCount();
		}
	}
	
	/**
	 * 
	 * @param i the dealers card
	 */
	
	public void playerHit(int i){
		boolean hit = true;
		while (hit){
			if (i < 7 && playerScore <18){
				playerHand.deal();
				scoreCount();
			}
			else if (i == 9 && playerScore < 19){
				playerHand.deal();
				scoreCount();
			}
			else if (i == 10 && playerScore <19){
				playerHand.deal();
				scoreCount();
			}
			else {
				hit = false;
			}
		}
	}
	
	/**
	 * returns the players score
	 * @return players score
	 */
	public int getPlayerScore(){
		return playerScore;
	}
	
	

}
