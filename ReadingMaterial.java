public class ReadingMaterial {
	protected String title;
	protected boolean inStock;
	protected String owner;
	protected int daysBorrowed;


	public ReadingMaterial(String title){
		this.title = title;
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
		this.owner = "";
	}

	public String getStatus(){
		if(inStock){
			return "In stock";
		}
		else{
			return "Out of stock\nCurrent owner: " + owner + "\nBorrowed for " + daysBorrowed + " days";
		}
	}

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public String getTitle(){
		return title;
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