package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int funcionario = sc.nextInt();
		int horastrabalho = sc.nextInt();
		double valor = sc.nextDouble();

		double salario = horastrabalho * valor;

		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();
	}

}
