
public class HealthyBurger extends Base {
	
	private String addition5Name;
	private double addition5Price;
	
	private String addition6Name;
	private double addition6Price;
	
	public HealthyBurger(String meatIn, double priceIn) {
		super("Healthy Burger", "Brown Rye Bread Roll", meatIn, priceIn);
	}
	
	public void addition5(String topping, double toppingPrice){
		this.addition5Name = topping;
		this.addition5Price = toppingPrice;
	}
	
	public void addition6(String topping, double toppingPrice){
		this.addition6Name = topping;
		this.addition6Price = toppingPrice;
	}

	@Override
	public double getDetails() {
		// TODO Auto-generated method stub
		
		
		double getTotal =  super.getDetails();
		
		if(this.addition5Name!=null){
			System.out.println(this.addition5Name +" topping costs "+this.addition5Price);
			getTotal += this.addition5Price;
		}
		if(this.addition6Name!=null){
			System.out.println(this.addition6Name +" topping costs "+this.addition6Price);
			getTotal += this.addition6Price;
		}
		
		
		return getTotal;
	}

	
	

}
