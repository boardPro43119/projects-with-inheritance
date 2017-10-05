public class Magazine extends ReadingMaterial{
	private String issue;
	private String subject;
	private int pageCount;
	private String coverStory;

	public Magazine(String title, String issue, String subject, int pageCount){
		super(title);
		this.writingType = "Magazine";
		this.issue = issue;
		this.subject = subject;
		this.pageCount = pageCount;
	}

	public void setIssue(String newIssue){
		issue = newIssue;
	}

	public void setSubject(String newSubject){
		subject = newSubject;
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

	public String getSubject(){
		return subject;
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
		result+=writingType + ", " + subject + "\n";
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