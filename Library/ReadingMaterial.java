public class ReadingMaterial {
	protected String title;
	protected String writingType;

	public ReadingMaterial(String title, String writingType){
		this.title = title;
		this.writingType = writingType;
	}

	public ReadingMaterial(String title){
		this.title = title;
		this.writingType = "Unknown";
	}

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public void setWritingType(String newWritingType){
		writingType = newWritingType;
	}

	public String get(String property){
		switch(property){
			case "title":
				return title;
			case "writingType":
				return writingType;
			default:
				return title + "does not have a property" + property;
		}
	}

	public String toString(){
		String result = "";

		result+=title + "\n\n";

		return result;
	}

}