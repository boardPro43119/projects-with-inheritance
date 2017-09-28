import java.util.ArrayList;

public class Book extends ReadingMaterial {
	private String writingType;
	private String genre;
	private int pageCount;
	private ArrayList<String> mainCharacters = new ArrayList<String>();

	public Book(String title, String author, int deweyDecimalNumber, String writingType, String genre, int pageCount){
		super(title, author, deweyDecimalNumber);
		this.writingType = writingType;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public Book(String title, String author, String writingType, String genre, int pageCount){
		super(title, author);
		this.writingType = writingType;
		this.genre = genre;
		this.pageCount = pageCount;
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

	public String toString(){
		String result = "";
		result+=title + "\n";
		result+="By " + author + "\n";
		result+=writingType + ", " + genre + "\n";
		result+=pageCount + " pages" + "\n";

		if(mainCharacters.size()>0){
			result+="Main characters: " + "\n";
			for (String character : mainCharacters) {
				result+=character + "\n";
			}
		}

		return result;
	}

}