import java.util.*;
class FindArmstrongRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number : ");
		int start = sc.nextInt();
		System.out.print("Enter upto/end number : ");
		int end = sc.nextInt();
		System.out.print("Armstrong Number from "+start+" to " +end+" : ");

		for (int i = start;i<=end ; i++ ) {
			int temp = i;
			int sum = 0;
			int count = 0;

			while(temp!=0){
				count++;
				temp=temp/10;
			}
			temp = i;

			while(temp!=0){
				int multi=1;
				// System.out.println(" "+temp + " ");
				for(int j =0;j<count;j++){
					multi=multi*(temp%10);
				}
				sum = sum+multi;
				temp=temp/10;
			}
			if (i==sum) {

				System.out.print(i+ " , ");
			}
		}
	}
}