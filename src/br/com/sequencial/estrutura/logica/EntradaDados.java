package br.com.sequencial.estrutura.logica;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine(); // nextLine extra para n�o pular a variavel s1
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
/*
 * quando h� comando de leitura diferente antes do nextLine, � nescessario
 * colocar um nextLine extra para que o codigo n�o pule a variavel que vem
 * depois da que � diferente.
 */