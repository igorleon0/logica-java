package br.com.vetores.logica;

import java.util.Scanner;

public class ExercicioVetor6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			String[] nomes = new String[N];
			int[] idades = new int[N];

			int maior = 0;
			String velho = "";
			for (int i = 0; i < N; i++) {
				nomes[i] = sc.next();
				idades[i] = sc.nextInt();
				if (idades[i] > maior) {
					maior = idades[i];
					velho = nomes[i];
				}
			}
			System.out.println("Pessoa mais velha: " + velho);

			sc.close();
		}

	}

}
