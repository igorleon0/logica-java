package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			int Coelhos = 0;
			int Ratos = 0;
			int Sapos = 0;

			for (int i = 0; i < N; i++) {

				int quantia = sc.nextInt();
				char tipo = sc.next().charAt(0);

				if (tipo == 'C') {
					Coelhos += quantia;
				} else if (tipo == 'R') {
					Ratos += quantia;
				} else if (tipo == 'S') {
					Sapos += quantia;
				}

			}

			int quantiaTotal = Coelhos + Ratos + Sapos;

			double porcentagemCoelhos = (double) Coelhos / quantiaTotal * 100.0;
			double porcentagemRatos = (double) Ratos / quantiaTotal * 100.0;
			double porcentagemSapos = (double) Sapos / quantiaTotal * 100.0;

			System.out.printf("Total: %d cobaias%n", quantiaTotal);
			System.out.printf("Total de coelhos: %d%n", Coelhos);
			System.out.printf("Total de ratos: %d%n", Ratos);
			System.out.printf("Total de sapos: %d%n", Sapos);

			System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);

			sc.close();

		}

	}

}
