package br.com.vetores.logica;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();

			double[] altura = new double[N];
			char[] sexo = new char[N];

			double maior = 0.0;

			double soma = 0.0;
			int contF = 0;
			int contM = 0;
			for (int i = 0; i < N; i++) {
				altura[i] = sc.nextDouble();
				sexo[i] = sc.next().charAt(0);
				if (sexo[i] == 'F') {
					contF++;
					soma = soma + altura[i];
				} else {
					contM++;
				}

				if (altura[i] > maior) {
					maior = altura[i];
				}

			}

			double menor = altura[0];
			for (int i = 0; i < N; i++) {
				if (altura[i] < menor)
					menor = altura[i];
			}

			double media = soma / contF;
			System.out.println("Menor altura = " + menor);
			System.out.println("Maior altura = " + maior);
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
			System.out.println("Numero de homens = " + contM);

			sc.close();

		}

	}
}
