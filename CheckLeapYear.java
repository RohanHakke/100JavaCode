import java.util.*;
class CheckLeapYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();

		// method 1.
		if ((year % 4 == 0 && year % 100!=0) || year % 400 == 0) {
			System.out.println(year+" Is leap year.");
		}else{
			System.out.println(year+" Is not leap year.");
		}

		// // Method 2.
		// String result = ((year % 4 == 0 && year % 100!=0) || year % 400 == 0) ? year + " Is leap year." : year+" Is not leap year.";
		// System.out.println(result);
	}
}