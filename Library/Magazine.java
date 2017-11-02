public class Magazine extends ReadingMaterial{
	private String issue;
	private String genreSubject;
	private int pageCount;
	private String coverStory;

	public Magazine(String title, String issue, String subject, int pageCount){
		super(title);
		this.writingType = "Magazine";
		this.issue = issue;
		this.genreSubject = subject;
		this.pageCount = pageCount;
	}

	public void setIssue(String newIssue){
		issue = newIssue;
	}

	public void setGenreSubject(String newGenreSubject){
		genreSubject = newGenreSubject;
	}

	public void setPageCount(int newPageCount){
		pageCount = newPageCount;
	}

	public void setCoverStory(String newCoverStory){
		coverStory = newCoverStory;
	}

	public String get(String property){
		switch(property){
			case "title":
				return title;
			case "writingType":
				return writingType;
			case "genreSubject":
				return genreSubject;
			case "pageCount":
				return String.valueOf(pageCount);
			case "coverStory":
				return coverStory;
			default:
				return title + "does not have a property" + property;
		}
	}

	// public String getIssue(){
	// 	return issue;
	// }

	// public String getGenreSubject(){
	// 	return genreSubject;
	// }

	// public int getPageCount(){
	// 	return pageCount;
	// }

	// public String getCoverStory(){
	// 	return coverStory;
	// }

	public String toString(){
		String result = "";
		result+=title + "\n";
		result+="Issue: " + issue + "\n";
		result+=writingType + ", " + genreSubject + "\n";
		if(pageCount!=0){
			result+=pageCount + " pages" + "\n";
		}

		if(coverStory!=null){
			result+="Cover story: " + coverStory + "\n";
		}

		result+="\n";

		return result;
	}

}