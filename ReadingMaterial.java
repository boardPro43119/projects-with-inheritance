public class ReadingMaterial {
	protected String title;
	protected String writingType;
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

	public int setOverdueLimit(){
		return daysUntilOverdue;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public void setWritingType(String newWritingType){
		writingType = newWritingType;
	}

	public String getWritingType(){
		return writingType;
	}

	public boolean inStock(){
		return inStock;
	}

	public String toString(){
		String result = "";

		result+=title + "\n\n";

		result+=getStatus();

		return result;
	}

}