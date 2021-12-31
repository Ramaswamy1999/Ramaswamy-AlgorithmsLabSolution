import java.util.Scanner;

public class TransactionCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Transactions --");
		int numberOfTransactions = sc.nextInt();
		
		int arr[] = new int[numberOfTransactions];
		
		System.out.println("Enter Transaction Values --");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Number of Targets achieved --");
		int numberOfTargets = sc.nextInt();
		
		while(numberOfTargets-- != 0) {
			System.out.println("Enter the value of target");
			long targetValue = sc.nextInt();
			boolean isTargetAchieved = false;
			
			long sum=0;
			for(int i=0; i<arr.length;i++) {
				sum = sum + arr[i];
				if(sum>=targetValue) {
					System.out.println("Target is achieved at " + (i+1) + " transaction(s)");
					isTargetAchieved = true;
					break;
				}
			}
			if(isTargetAchieved == false) {
				System.out.println("Your target cannot be achieved");
			}
		}
	}
}
