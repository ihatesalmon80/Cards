import java.util.Scanner;
public class BlackJack {
	
	Scanner scan = new Scanner(System.in);
	
	String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
	String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 11};
	int players; //number of players
	Card[][] decksDealed = new Card[players][];
	
	public BlackJack() {
		
		Deck d1 = new Deck(suits, values, points);
		d1.shuffle(); // shuffles deck
		
		for (int p=0; p<players; p++) {
			
			players = getPlayers();
			decksDealed = getDealedDecks(players, d1);
			//decksDealed now is an array of dealt cards for each player
			
			
		}
	
	}
	
	public int getPlayers() {
		players = scan.nextInt();
		return players;
	}
	
	public Card[][] getDealedDecks(int players, Deck deck) {
		for(int l=0; l<players; l++) {
			Card[] personsDeck = deck.dealCard(2);
			decksDealed[l] = personsDeck;
		}
		return decksDealed;
	}
		
}
