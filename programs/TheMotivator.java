public class TheMotivator {
  List<String> peopleList = new ArrayList<String>();
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

  public void sayHello() {
    System.out.println("Hello, Stranger !!");
    System.out.println("List Of Student Names:");
    for(int i=0; i < peopleList.size(); i++)
      System.out.println(peopleList.get(i));
  }
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
    tm.peopleList.add("Kiran");
    tm.peopleList.add("Andrew");
    tm.peopleList.add("Chris");
    sayHello();
		tm.feedback(60);
	}
}
