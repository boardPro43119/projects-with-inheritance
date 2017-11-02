import java.util.ArrayList;

public class Book extends ReadingMaterial {
	private String author;
	private double deweyDecimalNumber;
	private String genreSubject;
	private ArrayList<String> mainCharacters = new ArrayList<String>();
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

	public void setPageCount(int newPageCount){
		pageCount = newPageCount;
	}

	public String get(String property){
		switch(property){
			case "title":
				return title;
			case "writingType":
				return writingType;
			case "author":
				return author;
			case "deweyDecimalNumber":
				return String.valueOf(deweyDecimalNumber);
			case "genreSubject":
				return genreSubject;
			case "pageCount":
				return String.valueOf(pageCount);
			case "mainCharacters":
				return getMainCharacters();
			default:
				return title + "does not have a property" + property;
		}
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
		result+=writingType + ", " + genreSubject + "\n";
		if(pageCount!=0){
			result+=pageCount + " pages" + "\n";
		}

		if(mainCharacters.size()>0){
			result+="Main characters: " + "\n";
			result+=getMainCharacters();
		}

		result+="\n";

		return result;
	}

}