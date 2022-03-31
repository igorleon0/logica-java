package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nota100, nota50, nota20, nota10, nota5, nota2;
		double moeda1, moeda050, moeda025, moeda010, moeda05, moeda01;

		double valor = sc.nextDouble();

		nota100 = (int) valor / 100;
		valor = valor % 100;

		nota50 = (int) valor / 50;
		valor = valor % 50;

		nota20 = (int) valor / 20;
		valor = valor % 20;

		nota10 = (int) valor / 10;
		valor = valor % 10;

		nota5 = (int) valor / 5;
		valor = valor % 5;

		nota2 = (int) valor / 2;
		valor = valor % 2;
		
		valor = valor * 100.0;

		moeda1 = (int) valor / 100;
		valor = valor % 100.0;

		moeda050 = (int) valor / 50;
		valor = valor % 50.0;

		moeda025 = (int) valor / 25;
		valor = valor % 25.0;

		moeda010 = (int) valor / 10;
		valor = valor % 10.0;

		moeda05 = (int) valor / 5;
		valor = valor % 5.0;

		moeda01 = (int) valor / 1;
		valor = valor % 1.0;

		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", nota100);
		System.out.printf("%d nota(s) de R$ 50.00%n", nota50);
		System.out.printf("%d nota(s) de R$ 20.00%n", nota20);
		System.out.printf("%d nota(s) de R$ 10.00%n", nota10);
		System.out.printf("%d nota(s) de R$ 5.00%n", nota5);
		System.out.printf("%d nota(s) de R$ 2.00%n", nota2);
		System.out.println("MOEDAS:");
		System.out.printf("%.0f moeda(s) de R$ 1.00%n", moeda1);
		System.out.printf("%.0f moeda(s) de R$ 0.50%n", moeda050);
		System.out.printf("%.0f moeda(s) de R$ 0.25%n", moeda025);
		System.out.printf("%.0f moeda(s) de R$ 0.10%n", moeda010);
		System.out.printf("%.0f moeda(s) de R$ 0.05%n", moeda05);
		System.out.printf("%.0f moeda(s) de R$ 0.01%n", moeda01);

		sc.close();

	}

}
