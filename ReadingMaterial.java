import java.util.ArrayList;

public class ReadingMaterial {
	protected String title;
	protected String writingType;
	protected String author = "";
	protected double deweyDecimalNumber = 0;
	protected String genreSubject = "";
	protected ArrayList<String> mainCharacters = new ArrayList<String>();

	protected boolean inStock;
	protected String owner;
	protected int daysBorrowed;
	protected int daysUntilOverdue;

	public ReadingMaterial(String title, String writingType){
		this.title = title;
		this.writingType = writingType;
		this.inStock = true;
		this.owner = "";
	}

	public ReadingMaterial(String title){
		this.title = title;
		this.writingType = "Unknown";
		this.inStock = true;
		this.owner = "";
	}

	public void checkOut(String owner){
		this.inStock = false;
		this.daysBorrowed = 0;
		this.owner = owner;
	}

	public void addBorrowedDay(){
		daysBorrowed++;
	}

	public void checkIn(){
		this.inStock = true;
		this.daysBorrowed = 0;
		this.owner = "";
	}

	public String getStatus(){
		String result = "";
		if(inStock){
			result+="In stock";
		}
		else{
			result+="Out of stock\nCurrent owner: " + owner + "\n";
			if(daysBorrowed>daysUntilOverdue){
				result+="OVERDUE: Borrowed for " + daysBorrowed + " days";
			}
			else{
				result+="Borrowed for " + daysBorrowed + " days\n" + (daysUntilOverdue-daysBorrowed) + " days left to return";
			}
		}

		return result;
	}

	public int getDaysBorrowed(){
		return daysBorrowed;
	}

	public void setOverdueLimit(int threshold){
		daysUntilOverdue = threshold;
	}

	public int getOverdueLimit(){
		return daysUntilOverdue;
	}

	public boolean inStock(){
		return inStock;
	}

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public void setWritingType(String newWritingType){
		writingType = newWritingType;
	}

	public void setDeweyDecimalNumber(double newDeweyDecimalNumber){
		deweyDecimalNumber = newDeweyDecimalNumber;
	}

	public void setAuthor(String newAuthor){
		author = newAuthor;
	}

	public void setGenreSubject(String newGenreSubject){
		genreSubject = newGenreSubject;
	}

	public void addMainCharacter(String mainChar){
		mainCharacters.add(mainChar);
	}

	public boolean removeMainCharacter(String mainChar){
		return mainCharacters.remove(mainChar);
	}

	public String getTitle(){
		return title;
	}

	public String getWritingType(){
		return writingType;
	}

	public double getDeweyDecimalNumber(){
		return deweyDecimalNumber;
	}

	public String getAuthor(){
		return author;
	}

	public String getGenreSubject(){
		return genreSubject;
	}

	public String getMainCharacters(){
		String result = "";
		for(String character : mainCharacters){
			result+=character + "\n";
		}

		return result;
	}

	public String toString(){
		String result = "";

		result+=title + "\n\n";

		result+=getStatus();

		return result;
	}

}