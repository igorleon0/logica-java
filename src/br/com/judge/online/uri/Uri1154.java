package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int media = 0;
		int idadeTotal = 0;
		double mediaTotal;

		while (idade > 0) {
			idadeTotal += idade;
			media += 1;
			idade = sc.nextInt();

		}

		mediaTotal = (double) idadeTotal / media;
		System.out.printf("%.2f%n", mediaTotal);

		sc.close();

	}

}
