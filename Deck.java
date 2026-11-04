public class Deck {
	//collection of cards
	private Card[] deckOfCards; //declare only at this point
	private int cardsDealt = 0; // how many cards have been dealt
	
	/* constructor
	 * takes in 3 arrays from blackjack class
	 * different based on game played
	 */
	public Deck(String[] dsuits, String[] dvalues, int[] dpoints) {
		//constructor - need to initialize
		// for loop to create 52 cards
		// for loop for suits
			// for loop values
		deckOfCards = new Card[dsuits.length * dvalues.length];
		
		int index = 0;
		int suitsLength = dsuits.length;
		int valuesLength = dvalues.length;

		for (int i = 0; i < suitsLength; i++) { //looping through all suits
			for (int j = 0; j < valuesLength; j++) { //looping through all values within each suit
				deckOfCards[index] = new Card(dsuits[i], dvalues[j], dpoints[j]); //setting each newly made card to an index in the deck
				index++;
			}
		}
			
	}
	
	/*shuffle method
	 *fandomizes deck
	 */
	public void shuffle() {
	 //shuffles cards into random order
		System.out.println("Deck is Shuffled!");
	}
	
	/*deal method
	 * deals one card
	 */
	public Card deal() {
		Card card = deckOfCards[cardsDealt]; //deal next undealt card
		cardsDealt++;
		return card; //returns singular card
	}

	/*deal method
	 * deals multiple cards based on input of how many cards need to be dealt
	 */	
	public Card[] dealCard(int numCards) { //parameter is how many cards are dealt per person
		Card[] cardsMultiple = new Card[numCards]; //new array w length of numCards
		for (int j=0; j<numCards; j++) { //loop through number of cards
			Card card = deckOfCards[cardsDealt];
			cardsMultiple[j] = card; //assign each new card to index of player's array
			cardsDealt++;

		}
		return cardsMultiple; //returns array of cards
	
	}
	
	//toString method
//	public String toString(
		//return //use get functions to get suit, val, points, etc
}
