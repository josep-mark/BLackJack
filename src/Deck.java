/**
 * This class creates a deck of cards and shuffles it in the constructor
 * It also provides methods to deal a card and add cards back to the bottom of the deck
 */
import java.util.ArrayList;
import java.util.Random;

public class Deck {
//	private Card newCard;
	private ArrayList<Card> theDeck;
	
	/**
	 * constructor creates a new deck with 
	 * All suits and all cards	
	*/
	
	public Deck(){
		theDeck = new ArrayList<Card>(); 
		for (int suit = 0; suit < 4; suit ++){			
			for(int i = 1; i < 14; i ++){
//				newCard = new Card(i, suit);
				theDeck.add(new Card(i, suit));
			}
		}
	}
	
	/**
	 * 
	 * @return cards in the deck
	 */
	
	public int getSize(){
		return theDeck.size();
	}
	
	/**
	 * provides a way of getting a card from the deck
	 * @param n index of card to get
	 * @return a Card
	 */
	
	public Card getCard(int n){
		return theDeck.get(n);
	}
	
	/**
	 * provides a way to take a card from the deck
	 * @param n the index of the card to take
	 */
	
	public void removeCard(int n){
		theDeck.remove(n);
	}
	
	/**
	 * the deal method selects a random card from the deck and deals itout
	 * removes the card after it is dealt
	 * @return a card
	 */
	
	public Card deal(){
		Random rand = new Random();
		int num = rand.nextInt(theDeck.size());
		Card newCard = theDeck.get(num);
		theDeck.remove(num);
		return newCard;
	}
}
