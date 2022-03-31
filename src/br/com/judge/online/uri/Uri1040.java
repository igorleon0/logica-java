package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();

		float media = (float) ((n1 * 2.0 + n2 * 3.0 + n3 * 4.0 + n4 * 1.0) / 10.0);

		System.out.printf("Media: %.1f%n", media);
		if (media >= 7.0)
			System.out.println("Aluno aprovado.");
		else if (media < 5.0)
			System.out.println("Aluno reprovado.");
		else if (media >= 5.0 || media <= 6.9) {
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (float) ((notaExame + media) / 2.0);
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);

			} else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			}
		}

		sc.close();

	}

}
