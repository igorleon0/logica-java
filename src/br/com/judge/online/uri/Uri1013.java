package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();

		int maior = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
		maior = (maior + valor3 + Math.abs(maior - valor3)) / 2;

		System.out.println(maior + " eh o maior");

		sc.close();

	}

}
