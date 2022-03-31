package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int lanche = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;

		if (lanche == 1)
			total = quantidade * 4.0;

		else if (lanche == 2)
			total = quantidade * 4.5;

		else if (lanche == 3)
			total = quantidade * 5.0;

		else if (lanche == 4)
			total = quantidade * 2.0;

		else {
			total = quantidade * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();

	}

}
