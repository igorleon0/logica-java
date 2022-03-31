package br.com.vetores.logica;

import java.util.Scanner;

public class ExercicioVetor5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			int vet[] = new int[N];

			int cont = 0;
			double soma = 0.0;

			for (int i = 0; i < N; i++) {
				vet[i] = sc.nextInt();
				if (vet[i] % 2 == 0) {
					cont++;
					soma = soma + vet[i];
				}

			}

			double media = soma / cont;
			System.out.println(media);

			sc.close();
		}

	}

}
