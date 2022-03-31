package br.com.sequencial.estrutura.logica;

public class ProcessamentoDados {

	public static void main(String[] args) {
		
		double h, b, B, area;
		
		h = 5.0;
		b = 6.0;
		B = 8.0;
		
		area = (b + B) / 2 * h;  //Os parênteses quebram a precedência
		
		System.out.println(area);
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a / c;  //casting para calcular variaveis inteiros com resultado double
		
		System.out.println(resultado);
	   
		
		//casting é usado para forçar o calculo de variaveis com tipos diferentes
		
		
	}
	
}
