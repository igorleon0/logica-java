package br.com.judge.online.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double perimetro;
		double area;

		if (A < B + C && B < C + A && C < A + B) {
			perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();

	}

}
