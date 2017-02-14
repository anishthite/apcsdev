/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"1", "2", "3"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] value1 = {1, 2, 3};
	    Deck deck1 = new Deck(rank1, suit1, value1);

	    System.out.println("size: " + deck1.size());
	    System.out.println("isEmpty status" + !deck1.isEmpty());
	    System.out.println("dealt card: " + deck1.deal());
	    
	    String[] rank2 = {"10", "King", "Jack"};
	    String[] suit2 = {"Clubs", "Spades", "Hearts"};
	    int[] value2 = {10, 13, 11};
	    Deck deck2 = new Deck(rank2, suit2, value2);

	    System.out.println("size: " + deck2.size());
	    System.out.println("isEmpty status" + !deck2.isEmpty());
	    System.out.println("dealt card: " + deck2.deal());
	    
	    String[] rank3 = {"Ace", "3", "Queen"};
	    String[] suit3 = {"Clubs", "Spades", "Hearts"};
	    int[] value3 = {14, 3, 12};
	    Deck deck3 = new Deck(rank3, suit3, value3);

	    System.out.println("size: " + deck3.size());
	    System.out.println("isEmpty status" + !deck3.isEmpty());
	    System.out.println("dealt card: " + deck3.deal());
	}
}
