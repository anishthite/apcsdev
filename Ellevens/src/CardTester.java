/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1,card2,card3;
		card1 = new Card("2","Spades", 2);
		card2 = new Card("Queen","Hearts", 11);
		card3 = new Card("2","Spades", 2);
		
		test(card1,card3);
		test(card2,card1);
		test(card3,card1);
		}
	public static void test (Card card, Card card2){
		System.out.println(card.rank());
		System.out.println(card.suit());
		System.out.println(card.pointValue());
		System.out.println(card.matches(card2));
		System.out.println(card.toString());
		System.out.print("\n");
	}

}
