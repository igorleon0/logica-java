package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			for (int i = 1; i <= N; i++) {

				if (i % 2 == 0) {
					int calculo = i * i;
					System.out.println(i + "^2 = " + calculo);
				}
			}

			sc.close();
		}

	}

}
