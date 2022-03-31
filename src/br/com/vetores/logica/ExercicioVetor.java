package br.com.vetores.logica;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();
			double R[] = new double[N];

			for (int i = 0; i < N; i++) {
				R[i] = sc.nextDouble();
			}

			double maior = 0.0;
			int cont = 0;
			for (int i = 0; i < N; i++) {

				if (R[i] > maior) {
					maior = R[i];
					cont++;
				}

			}

			System.out.println(maior);
			System.out.println(cont);

			sc.close();

		}

	}

}
