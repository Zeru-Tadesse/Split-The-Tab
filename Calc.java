import java.util.*;
public class Calc{
	public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
		int people = Integer.parseInt(args[0]);
		double total=0;
		double[] totals = new double [people];
		for (int i =0; i < people;i++){
			totals[i] = getTotal(i);
			total += totals[i];
		}
		System.out.println("Enter total paid");
		double totalPaid = sc.nextDouble();
		double discount = 0;
		discount = totalPaid / total;
		System.out.println("Discount Rate = "+ discount);
		for (int i = 0; i < people; i ++){
			System.out.printf("Person %d owes:\t%.02f\n", i+1, totals[i]*discount);
		}
	}

	public static double getTotal(int num){
		System.out.printf("Enter user %d's items, end with new line:  ", num+1);
		String curr = sc.nextLine();
		double total = 0;
		while (!curr.equals("")){
			total+= Double.parseDouble(curr);
			curr = sc.nextLine();
		}
		return total;
	}


}
