public class SportsStat{
	protected String stat;
	protected double value;
	protected String[] possibleCategories;

	public SportsStat(String stat, double value, String[] possibleCategories){
		if(validStat(stat, possibleCategories)){
			this.stat = stat;
			this.value = value;
			this.possibleCategories = possibleCategories;
		}
	}

	public SportsStat(String stat, double value){
		this.stat = stat;
		this.value = value;
		this.possibleCategories = null;
	}

	public boolean changeStat(String newStat){ // Add code to return true if possibleCategories is null
		if(validStat(newStat)){
			stat = newStat;
			return true;
		}
		else{
			return false;
		}
	}

	public void changeValue(double newValue){
		value = newValue;
	}


	protected boolean validStat(String statistic, String[] categories){
		for(String category : categories){
			if(statistic.equalsIgnoreCase(category)){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return stat + ": " + value;
	}
}