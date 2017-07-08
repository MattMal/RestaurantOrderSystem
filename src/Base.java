
public class Base {
	private String name;
	private String bread;
	private String meat;
	private double price;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public Base(String nameIn, String breadIn, String meatIn, double priceIn) {
		this.name = nameIn;
		this.bread = breadIn;
		this.meat = meatIn;
		this.price = priceIn;
	}

	public boolean addition1(String topping, double toppingPrice) {
		this.addition1Name = topping;
		this.addition1Price = toppingPrice;
		return false;
	}

	public boolean addition2(String topping, double toppingPrice) {
		this.addition2Name = topping;
		this.addition2Price = toppingPrice;
		return false;

	}

	public boolean addition3(String topping, double toppingPrice) {
		this.addition3Name = topping;
		this.addition3Price = toppingPrice;
		return false;

	}

	public boolean addition4(String topping, double toppingPrice) {
		this.addition4Name = topping;
		this.addition4Price = toppingPrice;
		return false;

	}

	public double getDetails(){
		double getTotal = 0;
		System.out.println("The base price of the "+name+" burger is "+price);
		getTotal += price;

		if(this.addition1Name!=null){
			System.out.println(this.addition1Name +" topping costs "+this.addition1Price);
			getTotal += this.addition1Price;

		}
		if(this.addition2Name!=null){
			System.out.println(this.addition2Name +" topping costs "+this.addition2Price);
			getTotal += this.addition2Price;

		}
		if(this.addition3Name!=null){
			System.out.println(this.addition3Name +" topping costs "+this.addition3Price);
			getTotal += this.addition3Price;

		}
		if(this.addition4Name!=null){
			System.out.println(this.addition4Name +" topping costs "+this.addition4Price);
			getTotal += this.addition4Price;

		}
		return getTotal;
	}

}
