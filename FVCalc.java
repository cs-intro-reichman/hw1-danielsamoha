// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double newrate = rate + 100.0;
		double futureValue = currentValue;

		for (int i=0; i < n; i++){
			futureValue = futureValue * (newrate/100);
		}

		System.out.println("After " + n + " years, " + currentValue +
		 " saved at " + rate + "% will yield " + (int)futureValue +"$.");
	}
}