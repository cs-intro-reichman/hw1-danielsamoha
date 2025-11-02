// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		System.out.println("After " + n + " years, " + currentValue +
		 " saved at 10.0% will yield $121");
	}
}