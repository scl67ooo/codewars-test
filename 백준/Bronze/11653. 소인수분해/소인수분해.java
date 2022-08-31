import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (true) {
			if (n == 1) {
				break;
			}
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					n /= i;
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}
}