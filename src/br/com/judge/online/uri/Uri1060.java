package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		double valor4 = sc.nextDouble();
		double valor5 = sc.nextDouble();
		double valor6 = sc.nextDouble();

		int positivos = 0;

		if (valor1 > 0) {
			positivos += 1;
		}
		if (valor2 > 0) {
			positivos += 1;
		}
		if (valor3 > 0) {
			positivos += 1;
		}
		if (valor4 > 0) {
			positivos += 1;
		}
		if (valor5 > 0) {
			positivos += 1;
		}
		if (valor6 > 0) {
			positivos += 1;
		}

		System.out.printf("%d valores positivos%n", positivos);

		sc.close();

	}

}
