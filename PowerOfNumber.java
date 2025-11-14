import java.util.*;
class PowerOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		double num = sc.nextDouble();
		System.out.print("Enter Power/Index : ");
		int pw = sc.nextInt();
		double multi = 1.0;

		System.out.print(num + "^"+pw+" = ");
		while(pw>0){
			multi=multi*num;
			pw--;
		}
		System.out.print(multi);

	}
}