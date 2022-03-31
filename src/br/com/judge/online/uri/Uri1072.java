package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();
			int dentro = 0;
			int fora = 0;

			for (int i = 0; i < N; i++) {

				int valor = sc.nextInt();
				if (valor >= 10 && valor <= 20) {
					dentro += 1;
				} else {
					fora += 1;
				}
			}

			System.out.printf("%d in%n", dentro);
			System.out.printf("%d out%n", fora);

			sc.close();

		}

	}

}
