package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horasviagem = sc.nextInt();
		int velocidade = sc.nextInt();

		double litrosgastos = (double) (horasviagem * velocidade) / 12;

		System.out.printf("%.3f%n", litrosgastos);

		sc.close();

	}

}
