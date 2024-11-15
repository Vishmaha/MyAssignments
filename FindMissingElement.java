package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 3, 2, 8, 6, 7 };
		int sum = 0;
		int sum1 = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		for (int i = 1; i <= 8; i++) {
			sum1 = sum1 + i;
		}
		int sum3 = sum1 - sum;
		System.out.println("Missing value is :" + sum3);
	}
}
