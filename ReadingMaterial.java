public class ReadingMaterial {
	protected String title;
	protected String author;
	protected double deweyDecimalNumber = 0;


	public ReadingMaterial(String title, String author, int deweyDecimalNumber){
		this.title = title;
		this.author = author;
		this.deweyDecimalNumber = deweyDecimalNumber;
	}

	public ReadingMaterial(String title, String author){
		this.title = title;
		this.author = author;
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

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public void setAuthor(String newAuthor){
		author = newAuthor;
	}

	public void setDeweyDecimalNumber(double newDeweyDecimalNumber){
		deweyDecimalNumber = newDeweyDecimalNumber;
	}

	public String toString(){
		String result = "";
		result+=title + "\n";
		result+="By " + author + "\n";

		return result;
	}

}