public class MonetaryCoin extends Coin{
	private double moneyValue;

	public MonetaryCoin(double value){
		super();
		moneyValue = value;
	}

	public double value(){
		return moneyValue;
	}

	public String toString(){
		String faceName;
   		if (face == HEADS){
   			faceName = "Heads";
   		}
   		else {
   			faceName = "Tails";
   		}
      return moneyValue + ", " + faceName;
	}
}