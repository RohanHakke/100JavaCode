import java.util.*;
class PrimeFactorsOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		

		System.out.print("Prime factors of "+num+" : ");
		if (num%2==0) {
			System.out.print(2);
		}
		for (int i = 3;i<=num ;i++ ) {
			boolean isPrime = true;
			if (num%i==0) {
				// System.out.println(i);
				for (int j = 2;j<i ;j++ ) {
					if (i%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime){
				System.out.print(" "+i);
			}
			}

			

		}

	}
}