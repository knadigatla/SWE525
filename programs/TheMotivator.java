public class TheMotivator {
	public void studentFeedBack(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}

  public void sayHello() {
    System.out.println("Hello, Stranger !!");
  }
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
    sayHello();
		tm.feedback(60);
	}
}
