// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter range:");//Enter the range
		int min = input.nextInt();
		int max = input.nextInt();
		System.out.println("The range is: " + min + " - " + max);

		int [] list = new int[3];//Unorder array		
		for (int i = 0; i <  3; i++) {
			list[i] = (int)(Math.random()*(max - min + 1)) + min;
		}
		int [] orderlist = new int [3];//order arrays
		for (int i = 0; i <3; i++){//Run on the new array
			int minvalue = max + 1;//Will contain the min value on the unordred array
			int ind = - 1;//Will contain the index of the minimal value in the unordered array
			for (int j = 0; j < 3; j++){//run on the old array
				if (list[j] < minvalue){
					minvalue = list[j];
					ind = j;
					orderlist[i] = list[j];
				}
			}
			System.out.println(orderlist[i]);
			list[ind]= max + 1;
				
		}
		input.close();
	}
}

