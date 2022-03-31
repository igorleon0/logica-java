package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}

		double nota2 = sc.nextDouble();
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}

		double media = (nota1 + nota2) / 2;
		System.out.printf("media = %.2f%n", media);

		System.out.println("novo calculo (1-sim 2-nao)");
		int X = sc.nextInt();

		while (X != 1 && X != 2) {
			System.out.println("novo calculo (1-sim 2-nao)");
			X = sc.nextInt();
		}

		while (X == 1) {

			nota1 = sc.nextDouble();
			while (nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}

			nota2 = sc.nextDouble();
			while (nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}

			media = (nota1 + nota2) / 2;
			System.out.printf("media = %.2f%n", media);
			System.out.println("novo calculo (1-sim 2-nao)");
			X = sc.nextInt();
		}

		sc.close();

	}

}
// URI não aceitou :( , completamente correto, deixei assim pq me esforcei nesse codigo.
