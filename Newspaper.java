public class Newspaper extends ReadingMaterial{
	private String issue;
	private String coverStory;

	public Newspaper(String title, String issue){
		super(title);
		this.writingType = "Newspaper";
		this.issue = issue;
	}

	public void setIssue(String newIssue){
		issue = newIssue;
	}

	public void setCoverStory(String newCoverStory){
		coverStory = newCoverStory;
	}

	public String getIssue(){
		return issue;
	}

	public String getCoverStory(){
		return coverStory;
	}

	public String toString(){
		String result = "";

		result+=title + "\n";
		result+="Issue: " + issue + "\n";
		result+=writingType + "\n";

		if(coverStory!=null){
			result+="Cover story: " + coverStory + "\n";
		}

		result+="\n";
		result+=getStatus();

		return result;

	}
}