public class TheMotivator {
	public void studentFeedBack(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Sorry man, You have failed yourself!");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}
