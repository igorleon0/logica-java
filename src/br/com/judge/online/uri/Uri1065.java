package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		int valor5 = sc.nextInt();

		int pares = 0;

		if (valor1 % 2 == 0) {
			pares += 1;
		}

		if (valor2 % 2 == 0) {
			pares += 1;
		}

		if (valor3 % 2 == 0) {
			pares += 1;
		}

		if (valor4 % 2 == 0) {
			pares += 1;
		}

		if (valor5 % 2 == 0) {
			pares += 1;
		}

		System.out.printf("%d valores pares%n", pares);

		sc.close();

	}

}
