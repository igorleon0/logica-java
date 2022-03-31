package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int impar1 = 0;
		int impar2 = 0;
		int impar3 = 0;
		int impar4 = 0;
		int impar5 = 0;
		int impar6 = 0;

		if (X > 0 && X % 2 == 0) {

			impar1 = X + 1;
			impar2 = X + 3;
			impar3 = X + 5;
			impar4 = X + 7;
			impar5 = X + 9;
			impar6 = X + 11;

		} else {
			if (X > 0 && X % 2 != 0) {
				impar1 = X + 2;
				impar2 = X + 4;
				impar3 = X + 6;
				impar4 = X + 8;
				impar5 = X + 10;
				impar6 = X + 12;
			}
		}

		System.out.println(impar1);
		System.out.println(impar2);
		System.out.println(impar3);
		System.out.println(impar4);
		System.out.println(impar5);
		System.out.println(impar6);

		sc.close();

	}

}
/*SABIA que o URI não ia aceitar kkkk, funcionou, mas ele quer novamente com while ou for*/
