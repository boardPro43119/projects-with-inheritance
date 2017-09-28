public class MonetaryCoinTester {
	public static void main(String[] args){
		MonetaryCoin nickel = new MonetaryCoin(0.05);
		MonetaryCoin dime = new MonetaryCoin(0.1);
		MonetaryCoin quarter = new MonetaryCoin(0.25);

		System.out.println(nickel);
		System.out.println(dime);
		System.out.println(quarter);

		nickel.flip();
		dime.flip();
		quarter.flip();

		System.out.println(nickel);
		System.out.println(dime);
		System.out.println(quarter);
	}
}