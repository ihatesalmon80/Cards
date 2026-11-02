public class Card{

	private String suit;
	private String value;
	private int points;
	
	public Card(String csuit, String cvalue, int cpoints) {
		suit = csuit;
		value = cvalue;
		points = cpoints;
	}
	//getters and setters -> accessors and mutators
	
	public String getSuit() {
		return suit;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getPoints() {
		return points;
	}
}
