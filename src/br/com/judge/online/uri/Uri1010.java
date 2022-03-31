package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1 = sc.nextInt();
		int numeropeca1 = sc.nextInt();
		double valorpeca1 = sc.nextDouble();

		int peca2 = sc.nextInt();
		int numeropeca2 = sc.nextInt();
		double valorpeca2 = sc.nextDouble();

		double valortotal = (numeropeca1 * valorpeca1) + (numeropeca2 * valorpeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valortotal);

		sc.close();
	}

}
