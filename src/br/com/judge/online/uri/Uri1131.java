package br.com.judge.online.uri;

import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int golInter = sc.nextInt();
		int golGremio = sc.nextInt();

		int grenais = 0;
		int winInter = 0;
		int winGremio = 0;
		int empate = 0;

		grenais += 1;
		
		if (golInter > golGremio) {
			winInter += 1;
		}
		if (golGremio > golInter) {
			winGremio += 1;
		}

		if (golInter == golGremio) {
			empate += 1;
		}

		System.out.println("Novo grenal (1-sim 2-nao)");
		int X = sc.nextInt();
		while (X == 1) {

		golInter = sc.nextInt();
		golGremio = sc.nextInt();
		
		grenais += 1;
		
		if (golInter > golGremio) {
				winInter += 1;
			}
		if (golGremio > golInter) {
				winGremio += 1;
			}

		if (golInter == golGremio) {
				empate += 1;
			}
		System.out.println("Novo grenal (1-sim 2-nao)");
			X = sc.nextInt();
		}
				
		System.out.printf("%d grenais%n", grenais);
		System.out.println("Inter:" + winInter);
		System.out.println("Gremio:" + winGremio);
		System.out.println("Empates:" + empate);
		if (winInter > winGremio) {
			System.out.println("Inter venceu mais");
		}
		if (winGremio > winInter) {
			System.out.println("Gremio venceu mais");
		}
		if (winInter == winGremio) {
			System.out.println("Nao houve vencedor");
		}
		sc.close();

	}

}
