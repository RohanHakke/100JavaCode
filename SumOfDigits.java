import java.util.*;
class SumOfDigits{
	// // Method 2.
	// public static int sumDigit(int num,int sum){
	// 	if (num==0) {
	// 		return sum;
	// 	}
	// 	sum=sum+num%10;
	// 	return sumDigit(num/10,sum);
	// }

	// // Method 3.
	// public static int sumDigit(int num,int sum){
	// 	if (num==0) {
	// 		return 0;
	// 	}
	// 	return (num%10) + sumDigit(num/10,sum);
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;

		// Method 1.
		while(num!=0){
			sum = sum + num % 10;
			num = num/10;
		}
		System.out.println(sum);

		// // Method 2 and 3 calling and printing.
		// System.out.println(sumDigit(num,sum));
	}
}