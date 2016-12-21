/**
 * This class creates a card to be used in a deck
 * @author Joseph
 *
 */
public class Card {
	private final int rank;
	private final int suit;
	
	/**
	 * The construcor initializes a new card
	 * @param newRank the rank of the card
	 * @param newSuit the rank of the suit
	 */
	public Card(int newRank, int newSuit){
		rank = newRank;
		suit = newSuit;
	}
	
	/**
	 * Method returns the suit of a card 0 to 3
	 * @return the suit
	 */
	public int getSuit(){
		return suit;
	}
	
	/**
	 * Method returns the rank of a card in integer for 1 to 13
	 * @return the rank of the card
	 */
	public int getRank(){
		return rank;
	}
	
	/**
	 * 
	 * @return the suit as a string to be printed
	 */
	
	public String getSuitAsString(){
		String cardSuit = "";
		if (suit == 0){
			cardSuit = "Spades";
		}
		else if (suit == 1){
			cardSuit = "Hearts";
		}
		else if (suit == 2){
			cardSuit = "Diamonds";
		}
		else if (suit == 3){
			cardSuit = "Clubs";
		}
		return cardSuit;
	}
	
	/**
	 * gets rank as string
	 * @return the rank as a string
	 */
	
	public String getRankAsString(){
		String ret = "";
		if (rank == 1){
			ret = "Ace";
		}
		else if (rank == 11){
			ret = "Jack";
		}
		else if (rank == 12){
			ret = "Queen";
		}
		else if (rank == 13){
			ret = "King";
		}
		else{
			ret = Integer.toString(rank);
		}
		return ret;
	}
}
