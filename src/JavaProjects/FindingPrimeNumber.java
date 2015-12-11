package JavaProjects;

public class FindingPrimeNumber {
	public static boolean PrimeNumber(int n) {
		if (n < 1) {
			return false;
		}
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
