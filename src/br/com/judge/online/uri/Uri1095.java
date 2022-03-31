package br.com.judge.online.uri;

public class Uri1095 {

	public static void main(String[] args) {

		int I = 1;
		int J = 60;

		for (int i = 1; J >= 0; i++) {

			System.out.println("I=" + I + " J=" + J);
			I += 3;
			J = J - 5;

		}

	}
}