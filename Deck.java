public class Deck {
	//collection of cards
	Card[] deckOfCards; //declare only at this point
	public Deck(String[] dsuit, String[] dvalues, int[] dpoints) {
		//constructor - need to initialize
		// for loop to create 52 cards
		// for loop for suits
			// for loop values
		int s = 0;
		int v = 0;
		int d = 0;
			
		for(i=0; i<dsuit.length; i++) {
			for(j=0; j<dvalues.length; i++) {
				Card card = new Card(dsuit[i], dvalues[j], dpoints[j]);
			deckOfCards[i] = card;
			}
		}
	}
	
	//methods of Deck class like Shuffle, Deal
	public void shuffle() {
	
	}
	
}
