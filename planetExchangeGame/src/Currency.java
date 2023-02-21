
public abstract class Currency {
	String currencyName;
	double totalFunds;
	String name;
	

	public abstract double toEarthDollars(double amount);
	public abstract double fromEarthDollars(double EarthDollars);
	
	public void newTotalFunds(double amount) {
		this.totalFunds = this.totalFunds + amount;
	}
	
	
	public void exchange(Currency other, double amount) {
		if(this.totalFunds < amount) {
			System.out.println("Uh oh - " + this.name + " only has an available balance of $" + this.totalFunds + ", which is less than $"+amount + "!" );
			System.out.println();
			return;
		}
		System.out.println("Converting from " + this.currencyName + " to " + other.currencyName + " and initiating transfer . . ." );
		
		double EarthDollar = this.toEarthDollars(amount);
		double newTotal = other.fromEarthDollars(EarthDollar);
		other.newTotalFunds(newTotal);
		this.totalFunds = this.totalFunds - amount;
	
	    System.out.printf("$%.2f %s = $%.2f EarthDollars = $%.2f %s\n", amount, this.currencyName, toEarthDollars(amount), newTotal, other.currencyName); 
	    System.out.printf("%s has a total of $%.2f %s\n", this.name, this.totalFunds, this.currencyName);
	    System.out.printf("%s has a total of $%.2f %s\n", other.name, other.totalFunds, other.currencyName);
		System.out.println();
	}

}