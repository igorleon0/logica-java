package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			int horas = N / 3600;
			int minutos = N / 60 % 60;
			int segundos = N % 60;

			System.out.println(horas + ":" + minutos + ":" + segundos);

			sc.close();
		}

	}

}
