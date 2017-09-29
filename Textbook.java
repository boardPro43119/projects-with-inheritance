public class Textbook extends ReadingMaterial{
	private String author;
	private double deweyDecimalNumber;
	private String subject;
	private String gradeLevel;

	public Textbook(String title, double deweyDecimalNumber, String author, String subject, String gradeLevel){
		super(title);
		this.deweyDecimalNumber = deweyDecimalNumber;
		this.author = author;
		this.subject = subject;
		this.gradeLevel = gradeLevel;
	}

	public Textbook(String title, String author, String subject, String gradeLevel){
		super(title);
		this.author = author;
		this.subject = subject;
		this.gradeLevel = gradeLevel;
	}

	public void setDeweyDecimalNumber(double newDeweyDecimalNumber){
		deweyDecimalNumber = newDeweyDecimalNumber;
	}

	public void setAuthor(String newAuthor){
		author = newAuthor;
	}

	public void setSubject(String newSubject){
		subject = newSubject;
	}

	public void setGradeLevel(String newGradeLevel){
		gradeLevel = newGradeLevel;
	}

	public double getDeweyDecimalNumber(){
		return deweyDecimalNumber;
	}

	public String getAuthor(){
		return author;
	}

	public String getSubject(){
		return subject;
	}

	public String getGradeLevel(){
		return gradeLevel;
	}

	public String toString(){
		String result = "";

		result+=title + " (" + deweyDecimalNumber + ")\n";
		result+=subject + "\n";
		if(gradeLevel!=null){
			result+="Grade level: " + gradeLevel + "\n";
		}

		result+="\n";
		result+=getStatus();

		return result;

	}
}