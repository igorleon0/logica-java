package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int M = sc.nextInt();
			int N = sc.nextInt();
			int maior = 0;
			int menor = 0;
			int total = 0;

			while (M > 0 && N > 0) {

				if (M > N) {
					maior = M;
					menor = N;
				} else {
					maior = N;
					menor = M;
				}
				for (int i = menor; i < maior; i++) {
					System.out.print(i + " ");
					total = total + i;
				}
				total = total + maior;
				System.out.println(maior + " Sum=" + total);
				total = 0;

				M = sc.nextInt();
				N = sc.nextInt();
			}

			sc.close();
		}

	}

}
