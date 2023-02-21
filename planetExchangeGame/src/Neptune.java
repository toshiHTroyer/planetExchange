import java.text.DecimalFormat;

public class Neptune extends Currency implements Exchangable {
	
	public Neptune (double totalFunds) {
		this.currencyName = "NeptuneNuggets";
		this.totalFunds = totalFunds;
		this.name = "Neptune";
		
	}
	
	@Override
	public double toEarthDollars(double amount) {
		DecimalFormat df = new DecimalFormat("###.##"); 
        return Double.valueOf(df.format(amount/Exchangable.NNrate)); 
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
		  DecimalFormat df = new DecimalFormat("###.##"); 
	      return Double.valueOf(df.format(EarthDollars*Exchangable.NNrate)); 
	}
	
	
}