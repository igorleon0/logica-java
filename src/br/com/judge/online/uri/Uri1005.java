package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		double media = (A * 3.5 + B * 7.5) / 11;

		System.out.printf("MEDIA = %.5f%n", media);

		sc.close();

	}

}
// media ponderada = some os pesos das notas para saber o valor da divisão
//mutiplique a variavel correspodente ao peso dela, e depois faça a soma e divida pelo valor do peso
