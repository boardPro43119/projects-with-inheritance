public class FootballStat extends SportsStat {
	public String[] possibleCategories = {"Games", "Pass attempts", "Completions", "Completion percentage", "Passing yards",
									"Passing touchdowns", "Interceptions", "Fumbles", "Fumbles lost", "Rushing attempts",
									"Rushing yards", "Rushing touchdowns", "Receptions", "Receiving yards", "Receiving touchdowns",
									"Tackles", "Sacks", "Passes defended", "Forced fumbles", "Fumble recoveries", "Safeties", "Blocks",
									"Touchdowns", "Field goals made", "Field goals attempted", "Kickoffs", "Punts", "Return yards", "Return touchdowns"};

	public FootballStat(String category, double statValue){
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