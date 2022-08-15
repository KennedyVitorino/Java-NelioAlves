import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

			int mask = 0b00100000; // ou 32 em decimal
			int n = sc.nextInt();
			
			if ((n & mask) != 0) {
				System.out.println("6th bit is true!");
			}
			else {
				System.out.println("6th bit is false!");
			}
			
		}
	}
}
