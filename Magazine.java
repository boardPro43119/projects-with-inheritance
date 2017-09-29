public class Magazine extends ReadingMaterial{
	private String issue;
	private String subject;
	private String coverStory;

	public Magazine(String title, String issue, String subject){
		super(title);
		this.issue = issue;
		this.subject = subject;
	}

	public String getIssue(){
		return issue;
	}

	public String getSubject(){
		return subject;
	}

	public String getCoverStory(){
		return coverStory;
	}

	public void setIssue(String newIssue){
		issue = newIssue;
	}

	public void setSubject(String newSubject){
		subject = newSubject;
	}

	public void setCoverStory(String newCoverStory){
		coverStory = newCoverStory;
	}

	public String toString(){
		String result = "";
		result+=title + " (" + deweyDecimalNumber + ")\n";
		result+="Issue: " + issue + "\n";
		result+=subject + "\n";
		if(coverStory!=null){
			result+="Cover story: " + coverStory + "\n";
		}

		result+="\n";
		result+=getStatus();

		return result;
	}

}