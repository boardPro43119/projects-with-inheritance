public class BaseballStat extends SportsStat {
	public final String[] BASEBALL_STATS = {"Singles", "Doubles", "Triples", "At bats", "Batting average", "Walks", "Extra base hits",
									"Grand slams", "Hits", "HBPs", "Home runs", "Strikeouts", "On base percentage", "RBIs",
									"Slugging percentage", "Caught stealing", "Stolen bases", "Runs", "Balks", "Blown saves",
									"Complete games", "Earned runs", "ERA", "Games", "Starts", "Innings pitched", "Losses",
									"Pitches", "Saves", "Wins", "Wild pitches", "Errors", "Passed balls", "Double plays",
									"Triple plays"};

	public BaseballStat(String stat, double value){
		super(stat, value, BASEBALL_STATS);
	}

	public String toString(){
		return stat + ": " + value;
	}

}