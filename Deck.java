public class Deck {
	//collection of cards
	private Card[] deckOfCards; //declare only at this point
	private int cardsDealt = 0; // how many cards have been dealt
	
	/* constructor
	 * takes in 3 arrays from blackjack class
	 * 
	 */
	public Deck(String[] dsuits, String[] dvalues, int[] dpoints) {
		//constructor - need to initialize
		// for loop to create 52 cards
		// for loop for suits
			// for loop values
		deckOfCards = new Card[dsuits.length * dvalues.length];
		
		int index = 0;

		for (int i = 0; i < dsuits.length; i++) { //looping through all suits
			for (int j = 0; j < dvalues.length; j++) { //looping through all values within each suit
				deckOfCards[index] = new Card(dsuits[i], dvalues[j], dpoints[j]); //setting each newly made card to an index in the deck
				index++;
			}
		}
			
	}
	
	public void shuffle() {
	 //shuffles cards into random order
	}
	
	public Card deal() {
		Card card = deckOfCards[cardsDealt]; //deal next undealt card
		cardsDealt++;
		return card;
	}
	
	public Card[] dealCard(int numCards) { //parameter is how many cards are dealt per person
		Card[] cardsMultiple = new Card[numCards]; //new array w length of numCards
		for (int j=0; j<numCards; j++) { //loop through number of cards
			Card card = deckOfCards[cardsDealt];
			cardsMultiple[j] = card; //assign each new card to index of player's array
			cardsDealt++;

		}
		return cardsMultiple;
	
	}
}
