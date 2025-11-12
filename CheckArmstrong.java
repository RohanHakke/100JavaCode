import java.util.*;
class CheckArmstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int sum=0;

		while(num!=0){
			count++;
			num=num/10;
		}
		System.out.println(count);
		num = temp;

		while(num!=0){
			int multi=1;
			for (int i = 0;i<count ;i++ ) {
				multi = multi*num%10;
			}
			sum=sum+multi;
			num=num/10;
		}
		
		if (temp==sum) {
			System.out.println(temp + " is Armstrong Number.");
		}else{
			System.out.println(temp + " is Not Armstrong Number.");
		}
	}
}