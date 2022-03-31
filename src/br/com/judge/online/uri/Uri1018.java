package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

		int valor = sc.nextInt();

		System.out.println(valor);

		nota100 = valor / 100;
		valor = valor % 100;

		nota50 = valor / 50;
		valor = valor % 50;

		nota20 = valor / 20;
		valor = valor % 20;

		nota10 = valor / 10;
		valor = valor % 10;

		nota5 = valor / 5;
		valor = valor % 5;

		nota2 = valor / 2;
		valor = valor % 2;

		nota1 = valor / 1;
		valor = valor % 1;

		System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
		System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
		System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
		System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
		System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
		System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
		System.out.printf("%d nota(s) de R$ 1,00%n", nota1);

		sc.close();

	}

}
