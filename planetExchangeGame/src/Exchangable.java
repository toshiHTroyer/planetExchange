
public interface Exchangable {
	public static double EDrate = 1.00;
	public static double MMrate = 1.30;
	public static double SSrate = 0.87;
	public static double NNrate = 2.00;
	
	public void exchange(Currency other, double amount);
	double toEarthDollars(double EarthDollars);
	public void newTotalFunds(double amount);
	
}


