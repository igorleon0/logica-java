package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		while (X != 0) {

			if (X % 2 == 0) {
				X += X + 2 + X + 4 + X + 6 + X + 8;
				System.out.println(X);
			} else {
				X += 1;
				X += X + 2 + X + 4 + X + 6 + X + 8;
				System.out.println(X);
			}
			X = sc.nextInt();

		}

		sc.close();

	}

}
