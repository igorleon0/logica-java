package br.com.vetores.logica;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();
			int vet[] = new int[N];

			int cont = 0;

			for (int i = 0; i < N; i++) {
				vet[i] = sc.nextInt();

				if (vet[i] % 2 == 0) {
					cont++;
					System.out.print(vet[i] + " ");

				}

			}
			System.out.println();
			System.out.println(cont);

			sc.close();

		}
	}

}
