package in.manya.screeningtest;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scan.nextInt();

        int b = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < b; i++) {
            System.out.print((2 * i + 1) + " ");
        }

	}

}
