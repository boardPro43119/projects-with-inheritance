public class Newspaper extends ReadingMaterial{
	private String issue;
	private String coverStory;

	public Newspaper(String title, String issue){
		super(title);
		this.writingType = "Newspaper";
		this.issue = issue;
		this.coverStory = "";
	}

	public void setIssue(String newIssue){
		issue = newIssue;
	}

	public void setCoverStory(String newCoverStory){
		coverStory = newCoverStory;
		hasCoverStory = true;
	}

	public String get(String property){
		switch(property){
			case "title":
				return title;
			case "writingType":
				return writingType;
			case "coverStory":
				return coverStory;
			default:
				return title + "does not have a property" + property;
		}
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