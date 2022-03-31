package br.com.condicional.estrutura.logica;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int diaDaSemana = sc.nextInt();
		String dia;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			System.out.println(dia);
			break;
		case 2:
			dia = "Segunda";
			System.out.println(dia);
			break;
		case 3:
			dia = "Terça";
			System.out.println(dia);
			break;
		case 4:
			dia = "Quarta";
			System.out.println(dia);
			break;
		case 5:
			dia = "Quinta";
			System.out.println(dia);
			break;
		case 6:
			dia = "Sexta";
			System.out.println(dia);
			break;
		case 7:
			dia = "Sabado";
			System.out.println(dia);
			break;
		default:
			dia = "Valor invalido";
			System.out.println(dia);
		}

		sc.close();
	}

}
