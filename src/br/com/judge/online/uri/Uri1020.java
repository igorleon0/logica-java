package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ano, mes;

		int dias = sc.nextInt();

		ano = dias / 365;
		dias = dias % 365;

		mes = dias / 30;
		dias = dias % 30;

		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", dias);

		sc.close();

	}

}
