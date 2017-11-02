import java.util.ArrayList;

public class ReadingMaterialTester{
	public static void main(String args[]){
		Book hungerGames1 = new Book("The Hunger Games", 812, "Suzanne Collins", "Novel", "Dystopian", 316);

		// System.out.println(hungerGames);

		hungerGames.addMainCharacter("Katniss Everdeen");
		hungerGames.addMainCharacter("Peeta Mellark");

		Magazine sportsIllustrated1 = new Magazine("Sports Illustrated", "September 21, 2017", "Sports", 0);

		Newspaper nyTimes1 = new Newspaper("The New York Times", "September 29, 2017 New York Late Edition");

		nyTimes1.setCoverStory("Trump Administration is Pressed to Step Up Hurricane Recovery in Puerto Rico");

		// System.out.println(sportsIllustrated1);
		// System.out.println(nyTimes1);

		Library library = new Library("Newtown Public Library", 7);

		library.addItem(hungerGames);
		library.addItem(sportsIllustrated1);
		library.addItem(nyTimes1);

		System.out.println(hungerGames);

		hungerGames.checkOut("Benjamin Prud'homme");

		hungerGames.addBorrowedDay();
		hungerGames.addBorrowedDay();

		System.out.println(hungerGames);

		hungerGames.addBorrowedDay();

		System.out.println(hungerGames);

		hungerGames.checkIn();

		System.out.println(hungerGames);

		System.out.println(library.search("writing type", "newspaper"));

	}
}