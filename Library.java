import java.util.ArrayList;

public class Library {
	private ArrayList<ReadingMaterial> items = new ArrayList<ReadingMaterial>();
	private int overdueDaysLimit;

	public Library(int overdueDaysLimit){
		this.overdueDaysLimit = overdueDaysLimit;
	}

	public void addItem(ReadingMaterial newItem){
		items.add(newItem);
		newItem.setOverdueLimit(overdueDaysLimit);
	}

	public boolean removeItem(ReadingMaterial itemToRemove){
		return items.remove(itemToRemove);
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

}