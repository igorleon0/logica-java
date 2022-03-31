package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		int valor5 = sc.nextInt();

		int par = 0;
		int impar = 0;
		int positivos = 0;
		int negativos = 0;

		if (valor1 % 2 == 0) {
			par += 1;

		} else {
			impar += 1;
		}
		if (valor2 % 2 == 0) {
			par += 1;

		} else {
			impar += 1;
		}
		if (valor3 % 2 == 0) {
			par += 1;

		} else {
			impar += 1;
		}
		if (valor4 % 2 == 0) {
			par += 1;

		} else {
			impar += 1;
		}
		if (valor5 % 2 == 0) {
			par += 1;

		} else {
			impar += 1;
		}

		if (valor1 > 0) {
			positivos += 1;
		} else {
			negativos += 1;
		}
		if (valor2 > 0) {
			positivos += 1;
		} else {
			negativos += 1;
		}
		if (valor3 > 0) {
			positivos += 1;
		} else {
			negativos += 1;
		}
		if (valor4 > 0) {
			positivos += 1;
		} else {
			negativos += 1;
		}
		if (valor5 > 0) {
			positivos += 1;
		} else {
			negativos += 1;
		}

		if (valor1 == 0) {
			negativos -= 1;
		}
		if (valor2 == 0) {
			negativos -= 1;
		}
		if (valor3 == 0) {
			negativos -= 1;
		}
		if (valor4 == 0) {
			negativos -= 1;
		}
		if (valor5 == 0) {
			negativos -= 1;
		}

		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", impar);
		System.out.printf("%d valor(es) positivo(s)%n", positivos);
		System.out.printf("%d valor(es) negativo(s)%n", negativos);

		sc.close();

	}

}
