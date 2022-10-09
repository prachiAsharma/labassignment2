package GLalgoithumTraveler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Denomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sice of currency denimination ");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value:  ");
		Integer[] denomination = new Integer[size];
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}
		Arrays.sort(denomination, Collections.reverseOrder());
		System.out.println("Enter the amount you want to pay:  ");
		int amount = sc.nextInt();
		sc.close();
		int i = 0;
		int[] currencyCount = new int[size];
		while (amount > 0) {
			currencyCount[i] = amount / denomination[i];
			amount = amount - (denomination[i] * currencyCount[i]);
			i++;
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j = 0; j < size; j++) {;
			
			System.out.println(denomination[j] + " : " + currencyCount[j]);
		}
	}

}
