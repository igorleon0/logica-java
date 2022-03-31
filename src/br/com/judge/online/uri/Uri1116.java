package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {

				int valor1 = sc.nextInt();
				int valor2 = sc.nextInt();

				double divisao = (double) valor1 / valor2;
				if (valor2 == 0)
					System.out.println("divisao impossivel");
				else
					System.out.println(divisao);

			}

			sc.close();

		}

	}

}
