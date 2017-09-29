import java.util.ArrayList;

public class Book extends ReadingMaterial {
	private String author;
	private double deweyDecimalNumber;
	private String writingType;
	private String genre;
	private int pageCount;
	private ArrayList<String> mainCharacters = new ArrayList<String>();

	public Book(String title, int deweyDecimalNumber, String author, String writingType, String genre, int pageCount){
		super(title);
		this.deweyDecimalNumber = deweyDecimalNumber;
		this.author = author;
		this.writingType = writingType;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public Book(String title, String author, String writingType, String genre, int pageCount){
		super(title);
		this.author = author;
		this.writingType = writingType;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public void setDeweyDecimalNumber(double newDeweyDecimalNumber){
		deweyDecimalNumber = newDeweyDecimalNumber;
	}

	public void setAuthor(String newAuthor){
		author = newAuthor;
	}

	public void setWritingType(String newWritingType){
		writingType = newWritingType;
	}

	public void setGenre(String newGenre){
		genre = newGenre;
	}

	public void setPageCount(int newPageCount){
		pageCount = newPageCount;
	}

	public void addMainCharacter(String mainChar){
		mainCharacters.add(mainChar);
	}

	public boolean removeMainCharacter(String mainChar){
		return mainCharacters.remove(mainChar);
	}

	public double getDeweyDecimalNumber(){
		return deweyDecimalNumber;
	}

	public String getAuthor(){
		return author;
	}

	public String getWritingType(){
		return writingType;
	}

	public String getGenre(){
		return genre;
	}

	public int getPageCount(){
		return pageCount;
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
		result+=title + " (" + deweyDecimalNumber + ")\n";
		result+="By " + author + "\n";
		result+=writingType + ", " + genre + "\n";
		result+=pageCount + " pages" + "\n";

		if(mainCharacters.size()>0){
			result+="Main characters: " + "\n";
			result+=getMainCharacters();
		}

		result+="\n";
		result+=getStatus();

		return result;
	}

}