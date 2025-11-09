import java.util.*;
class CheckPositiveNegativeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		// // 2. Method Two using if-else.
		// if (num>=0) {
		// 	if(num==0){
		// 	System.out.println("Number is zero");
		// }else{
		// 	System.out.println("Positive Number");
		// }
		// }else{
		// System.out.println("Negative Number");	
		// }

		// 1. Method One Using Ternary Operator.
		String result = (num == 0)? "Zero":(num>0)?"Positive":"Negative";
		System.out.println(num + " is "+result+" Number.");
	}

}