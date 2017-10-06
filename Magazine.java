public class Magazine extends ReadingMaterial{
	private String issue;
	private String subject;
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

	public void setPageCount(int newPageCount){
		pageCount = newPageCount;
	}

	public void setCoverStory(String newCoverStory){
		coverStory = newCoverStory;
	}

	public String getIssue(){
		return issue;
	}

	public int getPageCount(){
		return pageCount;
	}

	public String getCoverStory(){
		return coverStory;
	}

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
		result+=getStatus();

		return result;
	}

}