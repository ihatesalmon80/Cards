public class Card{

	private String suit;
	private String value;
	private int points;
	
	//constructor for each card
	public Card(String csuit, String cvalue, int cpoints) {
		suit = csuit;
		value = cvalue;
		points = cpoints;
	}
	//getters and setters -> accessors and mutators
	
	/*getter
	 * for suits
	 */
	public String getSuit() {
		return suit;
	}
	
	/*getter
	 * for values
	 */
	public String getValue() {
		return value;
	}
	
	/*getter
	 * for points
	 */
	public int getPoints() {
		return points;
	}
	
	/*setter
	 * for points
	 */
	public void setPoints(int points) {
		this.points = points;
		
	}
	

}
