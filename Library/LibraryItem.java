public class LibraryItem {

	private boolean inStock;
	private String owner;
	private int daysBorrowed;
	private int daysUntilOverdue;
	private ReadingMaterial item;

	public LibraryItem(ReadingMaterial item, int daysUntilOverdue){
		this.inStock = true;
		this.daysBorrowed = 0;
		this.daysUntilOverdue = daysUntilOverdue;
		this.item = item;
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
			result+="In stock\n";
		}
		else{
			result+="Out of stock\nCurrent owner: " + owner + "\n";
			if(daysBorrowed>daysUntilOverdue){
				result+="OVERDUE: Borrowed for " + daysBorrowed + " days\n";
			}
			else{
				result+="Borrowed for " + daysBorrowed + " days\n" + (daysUntilOverdue-daysBorrowed) + " days left to return\n";
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

	public String get(String property){
		return item.get(property);
	}

	public String toString(){
		String result = "";

		result+=item.toString();
		result+=getStatus();

		return result;
	}

}