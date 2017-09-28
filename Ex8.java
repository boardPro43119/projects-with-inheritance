public class Ex8 {
	public static class Gem {
		protected String color;

		public Gem(String color){
			this.color = color;
				System.out.println("Created " + color + " gem");
		}

	}

	public static class SpecialGem extends Gem{
		private String specialGemType;

		public SpecialGem(String color, String specialGemType){
			super(color);
			this.specialGemType = specialGemType;
			System.out.println("Created " + this.color + " " + this.specialGemType + " gem");
		}

	}

	public static void main(String[] args){
		Gem yellowGem = new Gem("yellow");
		SpecialGem greenFlameGem = new SpecialGem("green", "flame");
	}
}