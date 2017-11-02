import java.util.ArrayList;

public class Library {
	private String name;
	private int overdueDaysLimit;
	private ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();

	public Library(String name, int overdueDaysLimit){
		this.name = name;
		this.overdueDaysLimit = overdueDaysLimit;
	}

	public void addItem(ReadingMaterial newItem){
		LibraryItem item = new LibraryItem(newItem, overdueDaysLimit);
		items.add(item);
	}

	public boolean removeItem(LibraryItem itemToRemove){
		return items.remove(itemToRemove);
	}

	public String search(String category, String query){
		category = category.toLowerCase();

		if(category.contains("title") || category.contains("name")){
			category = "title";
		}
		else if(category.contains("author")){
			category = "author";
		}
		else if(category.contains("type")){
			category = "writingType";
		}
		else if(category.contains("genre") || category.contains("subject")){
			category = "genreSubject";
		}
		else if(category.contains("dewey")){
			category = "deweyDecimalNumber";
		}
		else if(category.contains("character")){
			category = "mainCharacters";
		}
		else if(category.contains("story")){
			category = "coverStory";
		}

		String result = "Search results for " + category + " " + query + "\n";

		for(LibraryItem item : items){
			if(category=="deweyDecimalNumber"){
				if(item.get(category).equals(formatDeweyInput(query))){
					result+=item;
				}
			}
			else {
				if(item.get(category).toLowerCase().contains(query.toLowerCase())){
					result+=item;
				}
			}
		}

		return result;
	}

	public String getOverdueItems(){
		String result = "";

		for (LibraryItem item : items) {
			if(item.getDaysBorrowed()>overdueDaysLimit){
				result+=item;
			}
		}

		if(result.equals("")){
			result = "No overdue items";
		}

		return result;
	}

	private String formatDeweyInput(String input){
		return String.valueOf(Double.parseDouble(input));
	}

	public String toString(){
		String result = "";

		result+=name + "\nTotal items: " + items.size() + "\nOverdue items:\n" + getOverdueItems();

		return result;
	}

}