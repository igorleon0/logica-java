package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		double valor4 = sc.nextDouble();
		double valor5 = sc.nextDouble();
		double valor6 = sc.nextDouble();

		int positivos = 0;
		double media = 0;

		if (valor1 > 0) {
			positivos += 1;
			media += valor1;
		}
		if (valor2 > 0) {
			positivos += 1;
			media += valor2;
		}
		if (valor3 > 0) {
			positivos += 1;
			media += valor3;
		}
		if (valor4 > 0) {
			positivos += 1;
			media += valor4;
		}
		if (valor5 > 0) {
			positivos += 1;
			media += valor5;
		}
		if (valor6 > 0) {
			positivos += 1;
			media += valor6;
		}

		media /= positivos;
		System.out.printf("%d valores positivos%n", positivos);

		System.out.println(media);

		sc.close();

	}

}

/*Resposta está correta, mas..
 * Uri não aceitou, ele quer que eu use o comando for, porém esse atividade foi
 * proposta antes de eu estudar o mesmo.
 */