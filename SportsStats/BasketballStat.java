public class BasketballStat extends SportsStat {
	public String[] possibleCategories = {"3-pt FG made", "3-pt FG attempts", "FG made", "FG attempts", "FG percentage",
									"Free throws made", "Free throw attempts", "Points", "Points in paint",
									"Offensive rebounds", "Defensive rebounds", "Rebounds", "Assists", "Turnovers",
									"Forced turnovers", "Steals", "Blocks", "Fouls", "Minutes"};

	public BasketballStat(String category, double statValue){
		if(validStat(category)){
			super(category, value);
		}
	}

	public boolean changeStat(String newStat){
		if(validStat(newStat)){
			stat = newStat;
			return true;
		}
		else{
			return false;
		}
	}

	private boolean validStat(String stat){
		for(String category : possibleCategories){
			if(stat.equalsIgnoreCase(category)){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return stat + ": " + value;
	}

}