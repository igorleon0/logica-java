package br.com.sequencial.estrutura.logica;
import java.util.Locale;

public class DecimaisPrintf {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);      //serve pra trocar a virgula padrão por ponto
		double x;
		x = 32.123;
		double y = 39.3939;
		System.out.printf("%.2f%n", x);  //a variavel x vai ficar no %.2f
		System.out.printf("Resultado = %.2f metros%n", y);
		System.out.printf("Resultado = %.3f metros%n", y);

		String nome = "Igor";
		int idade = 11;
		double renda = 80;
		System.out.printf("%s tem %d anos e ganha %.2f por semana", nome, idade, renda);

	}

}

// %.?f = armazenar variaveis double, a numeração é a quantidade de casas decimais
// %s = armarzenar variaveis String
// %d = armarzenar variaveis interio (int)
// %n = isso serve como quebra de linha, ao utilizar o printf