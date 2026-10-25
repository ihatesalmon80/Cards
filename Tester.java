public class Tester {
	public static void main(String[] args) {
		
		DeckofCards d1 = new DeckofCards();
		String[] cards = d1.makeDeck();
		for (int l = 0; l < cards.length; l++){
			System.out.println(cards[l]);
		}
	}

}
