package br.com.vetores.logica;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			double R[] = new double[N];

			double soma = 0.0;

			for (int i = 0; i < N; i++) {
				R[i] = sc.nextDouble();
				soma = soma + R[i];
			}
			double media = soma / N;
			System.out.printf("%.3f%n", media);

			for (int i = 0; i < N; i++) {
				if (R[i] < media) {
					System.out.println(R[i]);
				}
			}

			sc.close();
		}

	}

}
