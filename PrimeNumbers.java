import java.util.*;
class PrimeNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start Number : ");
		int start = sc.nextInt();
		System.out.print("Enter End Number : ");
		int end = sc.nextInt();
		boolean isPrime= false;
		System.out.print(start + " to " + end + " prime numbers : ");
		
		// Method 1.
		for (int i = start;i<=end ;i++ ) {
			isPrime=false;
			for (int j = 2;j<=i/2;j++){
				if (i%j==0) {
					isPrime=true;
				}
			}
			if (!isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Method 2. change only formula  j<=i/2 into j<=Math.sqrt(end)
	}
}