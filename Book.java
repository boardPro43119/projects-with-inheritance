public class Book extends ReadingMaterial {

	private int pageCount;

	public Book(String title, double deweyDecimalNumber, String author, String writingType, String genre, int pageCount){
		super(title, writingType);
		this.deweyDecimalNumber = deweyDecimalNumber;
		this.author = author;
		this.genreSubject = genre;
		this.pageCount = pageCount;
	}

	public Book(String title, String author, String writingType, String genre, int pageCount){
		super(title, writingType);
		this.author = author;
		this.genreSubject = genre;
		this.pageCount = pageCount;
	}

	public void setPageCount(int newPageCount){
		pageCount = newPageCount;
	}

	public int getPageCount(){
		return pageCount;
	}

	public String toString(){
		String result = "";
		result+=title + " (" + deweyDecimalNumber + ")\n";
		result+="By " + author + "\n";
		result+=writingType + ", " + genreSubject + "\n";
		if(pageCount!=0){
			result+=pageCount + " pages" + "\n";
		}

		if(mainCharacters.size()>0){
			result+="Main characters: " + "\n";
			result+=getMainCharacters();
		}

		result+="\n";
		result+=getStatus() + "\n";

		return result;
	}

}