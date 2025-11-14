import java.util.*;
class FactorsOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		System.out.print("Factors of "+num +" : ");
		for (int i = 1;i<=num/2 ;i++ ) {
			if (num%i==0){
				System.out.print(i + " ");
			}
		}
		System.out.print(num);
	}
}