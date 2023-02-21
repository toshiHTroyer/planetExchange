import java.text.DecimalFormat;

public class Mars extends Currency implements Exchangable {
	
	public Mars (double totalFunds) {
		this.currencyName = "MarsMoney";
		this.totalFunds = totalFunds;
		this.name = "Mars";
	}
	
	@Override
	public double toEarthDollars(double amount) {
		DecimalFormat df = new DecimalFormat("###.##"); 
        return Double.valueOf(df.format(amount/Exchangable.MMrate)); 
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
	    DecimalFormat df = new DecimalFormat("###.##"); 
        return Double.valueOf(df.format(EarthDollars*Exchangable.MMrate)); 
	}
	
}
