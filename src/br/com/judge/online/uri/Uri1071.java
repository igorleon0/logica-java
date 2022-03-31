package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int X = sc.nextInt();
			int Y = sc.nextInt();

			int min;
			int max;
			if (X > Y) {
				max = X;
				min = Y;

			} else {
				max = Y;
				min = X;
			}
			int soma = 0;
			for (int i = min + 1; i < max; i++) {
				if (i % 2 != 0) {
					soma += i;
				}

			}

			System.out.println(soma);

			sc.close();

		}

	}

}
