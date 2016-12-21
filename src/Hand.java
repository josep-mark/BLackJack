import java.util.ArrayList;
/**
 * This class will create a hand of blackjack and perform operations on hand
 * @author Joseph
 *
 */
public class Hand {

	private ArrayList<Card> newHand;
	private Deck theDeck;
	
	/**
	 * The constructor creates an arraylist of cards for the hand
	 * @param playDeck the deck to be used to get cards from
	 */
	
	public Hand(Deck playDeck){
		newHand = new ArrayList<Card>();
		theDeck = playDeck;
	}
	
	/**
	 * gives a card to a hand
	 */
	
	public void deal(){
		Card newCard = theDeck.deal();
		newHand.add(newCard);
	}
	
	/**
	 * prints a cards rank and suit
	 * @param i card to be printed
	 */
	
	private void printCard(Card i){
		System.out.println(i.getRankAsString() + " of " +i.getSuitAsString());
	}
	
	/**
	 * prints the entire hand
	 */
	
	public void printHand(){
		for (Card i : newHand){
			printCard(i);
		}
	}
	
	/**
	 * prints a card using the index in the of the hand
	 * @param i index to print
	 */
	
	public void printIndexCard(int i){
		Card cardToPrint = newHand.get(i);
		printCard(cardToPrint);
	}
	
	/**
	 * counts the score of a hand
	 * aces count as 11 in this version
	 * @return
	 */
	
	public int scoreCount(){
		int score = 0;
		for (Card i : newHand){
			if (i.getRank() == 1){
				score += 11;
			}
			else if (i.getRank() > 10){
				score += 10;
			}
			else {
				score += i.getRank();
			}
		}
		return score;
	}
	
	/**
	 * counts the score of a hand
	 * Aces count as one in this version
	 * @return score
	 */
	
	public int aceAlternativeCount(){
		int score = 0;
		for (Card i : newHand) {
			if (i.getRank() > 10){
				score += 10;
			}
			else {
				score += i.getRank();
			}
		}
		return score;
	}
	
	/**
	 * 
	 * @return size of a hand
	 */
	public int getSize(){
		return newHand.size();
	}
	
	/**
	 * gets a card from a hand
	 * @param i index of card to get
	 * @return a card from the hand
	 */
	
	public Card getCard(int i){
		return newHand.get(i);
	}
	
	public ArrayList<Card> getHand(){
		return newHand;
	}
}
