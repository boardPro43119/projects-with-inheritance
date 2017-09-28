public class ReadingMaterial {
	protected String title;
	protected String author;
	protected double deweyDecimalNumber = 0;

	protected boolean inStock;
	protected String owner;
	protected int daysBorrowed;


	public ReadingMaterial(String title, String author, int deweyDecimalNumber){
		this.title = title;
		this.author = author;
		this.deweyDecimalNumber = deweyDecimalNumber;
		this.inStock = true;
		this.owner = "";
	}

	public ReadingMaterial(String title, String author){
		this.title = title;
		this.author = author;
		this.inStock = true;
		this.owner = "";
	}

	public void checkOut(String owner, int daysToReturn){
		this.inStock = false;
		this.daysBorrowed = 0;
		this.owner = owner;
	}

	public void addBorrowedDay(){
		daysBorrowed++;
	}

	public void checkIn(){
		this.inStock = true;
		this.owner = "";
	}

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public void setAuthor(String newAuthor){
		author = newAuthor;
	}

	public void setDeweyDecimalNumber(double newDeweyDecimalNumber){
		deweyDecimalNumber = newDeweyDecimalNumber;
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getDeweyDecimalNumber(){
		return deweyDecimalNumber;
	}

	public boolean inStock(){
		return inStock;
	}

	public String toString(){
		String result = "";
		result+=title + " (" + deweyDecimalNumber + ")\n";
		result+="By " + author + "\n";

		if(inStock){
			result+="\nIn stock";
		}
		else{
			result+="\nOut of stock\nCurrent owner: " + owner + "\nBorrowed for " + daysBorrowed + " days";
		}

		return result;
	}

}