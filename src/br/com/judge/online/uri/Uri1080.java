package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		int maior = 0;
		int posicao = 0;

		N = sc.nextInt();
		maior = N;

		for (int i = 2; i <= 100; i++) {

			N = sc.nextInt();

			if (N > maior) {
				maior = N;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}

}
