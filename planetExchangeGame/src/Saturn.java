import java.text.DecimalFormat;

class Saturn extends Currency implements Exchangable {
	
	public Saturn (double totalFunds) {
		this.currencyName = "SaturnSilver";
		this.totalFunds = totalFunds;
		this.name = "Saturn";
		
	}

	@Override
	public double toEarthDollars(double amount) {
		DecimalFormat df = new DecimalFormat("###.##"); 
		return Double.valueOf(df.format(amount/Exchangable.SSrate)); 
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
	    DecimalFormat df = new DecimalFormat("###.##"); 
        return Double.valueOf(df.format(EarthDollars*Exchangable.SSrate)); 
	}

	
}
