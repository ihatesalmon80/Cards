public class DeckofCards {
	
	String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
	String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	String[] cards = new String[52];
	int k = 0;
	public String[] makeDeck() {
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				cards[k] = values[j] + " of " + suits[i];
				k++;
		
			}
		}
		return cards;
	}
}
