package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		int PROD = n1 * n2;

		System.out.println("PROD = " + PROD);

		sc.close();

	}

}
