package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int maior = 0;
		int meio = 0;
		int menor = 0;

		if (valor1 > valor2 && valor1 > valor3) {
			maior = valor1;

			if (valor2 > valor3) {
				meio = valor2;
				menor = valor3;
			} else {
				meio = valor3;
				menor = valor2;
			}
		} else if (valor2 > valor1 && valor2 > valor3) {
			maior = valor2;

			if (valor1 > valor3) {
				meio = valor1;
				menor = valor3;
			} else {
				meio = valor3;
				menor = valor1;
			}
		} else if (valor3 > valor1 && valor3 > valor2) {
			maior = valor3;

			if (valor1 > valor2) {
				meio = valor1;
				menor = valor2;
			} else {
				meio = valor2;
				menor = valor1;
			}
		}

		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		System.out.println();
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);

		sc.close();

	}

}
