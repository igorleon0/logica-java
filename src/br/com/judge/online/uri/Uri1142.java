package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int N = sc.nextInt();
			int d = 0;
			for (int i = 0; i < N; i++) {

				d++;
				System.out.println(d + " " + (d + 1) + " " + (d + 2) + " PUM");
				d = d + 1 + 2;

			}

			sc.close();
		}

	}

}
