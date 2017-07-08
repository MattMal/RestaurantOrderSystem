
public class Main {
	static Base base = new Base("Basic", "White", "Sausage", 4.99 );
	static HealthyBurger hb = new HealthyBurger("Sausage", 3.59);

	public static void main(String[] args) {
		base.addition1("Cheese", 0.27);
		base.addition2("Bacon", 0.77);
		base.addition3("Mushroom", 0.40);
		base.addition4("Shrimps", 1.29);
		System.out.printf("The grand total is %.2f ",base.getDetails());
		
		System.out.println("\n");



		hb.addition1("Cheese", 0.27);
		hb.addition2("Bacon", 0.77);
		hb.addition3("Mushroom", 0.40);
		hb.addition4("Shrimps", 1.29);
		hb.addition5("Bacon", 0.77);
		hb.addition6("Bacon", 0.77);


		System.out.printf("The grand total is %.2f ",hb.getDetails());


	}

}
