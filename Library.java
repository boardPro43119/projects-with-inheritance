import java.util.ArrayList;

public class Library {
	private String name;
	private int overdueDaysLimit;
	private ArrayList<ReadingMaterial> items = new ArrayList<ReadingMaterial>();

	public Library(String name, int overdueDaysLimit){
		this.name = name;
		this.overdueDaysLimit = overdueDaysLimit;
	}

	public void addItem(ReadingMaterial newItem){
		items.add(newItem);
		newItem.setOverdueLimit(overdueDaysLimit);
	}

	public boolean removeItem(ReadingMaterial itemToRemove){
		return items.remove(itemToRemove);
	}

	public String search(String category, String query){
		if(category.toLowerCase().contains("title") || category.toLowerCase().contains("name")){
			category = "title";
		}
		else if(category.toLowerCase().contains("author")){
			category = "author";
		}
		else if(category.toLowerCase().contains("type")){
			category = "writing type";
		}
		else if(category.toLowerCase().contains("genre") || category.toLowerCase().contains("subject")){
			category = "genre/subject";
		}
		else if(category.toLowerCase().contains("dewey")){
			category = "Dewey Decimal number";
		}
		else if(category.toLowerCase().contains("character")){
			category = "main character";
		}
		else if(category.toLowerCase().contains("story")){
			category = "cover story";
		}

		String result = "Search results for " + category + " " + query + "\n";

		switch(category){
			case "title":
				for (ReadingMaterial item : items) {
					if(item.get("title").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			case "author":
				for (ReadingMaterial item : items) {
					if(item.get("author").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			case "writing type":
				for (ReadingMaterial item : items) {
					if(item.get("writingType").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			case "genre/subject":
				for (ReadingMaterial item : items) {
					if(item.get("genreSubject").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			case "Dewey Decimal number":
				for (ReadingMaterial item : items) {
					if(item.get("deweyDecimalNumber").equals(query)){
						result+=item;
					}
				}
				break;
			case "main character":
				for (ReadingMaterial item : items) {
					if(item.get("mainCharacters").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			case "cover story":
				for (ReadingMaterial item : items) {
					if(item.get("coverStory").toLowerCase().contains(query.toLowerCase())){
						result+=item;
					}
				}
				break;
			default:
				result+=category + " is not a valid search category";

		}

		return result;
	}

	public String getOverdueItems(){
		String result = "";

		for (ReadingMaterial item : items) {
			if(item.getDaysBorrowed()>overdueDaysLimit){
				result+=item;
			}
		}

		if(result.equals("")){
			result = "No overdue items";
		}

		return result;
	}

	public String toString(){
		String result = "";

		result+=name + "\nTotal items: " + items.size() + "\nOverdue items:\n" + getOverdueItems();

		return result;
	}

}