import java.util.*;
class CheckEvenOddNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		// // Method 1
		// if (num % 2==0) {
		// 	System.out.println("Even Number.");
		// }else{
		// 	System.out.println("Odd Number");
		// }

		// // Method 2
		String result = num %2 ==0 ? "Even" : "Odd";
		System.out.println(num + " is " + result + " Number.");
		


	}
}