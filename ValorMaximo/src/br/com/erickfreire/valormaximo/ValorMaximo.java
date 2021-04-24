package br.com.erickfreire.valormaximo;

import java.util.Scanner;

/**
 * Programa em Java que calcula o valor m�ximo
 * @author Erick Freire
 * @version 1 - Criado em 24-04-2021 as 18:15
 */

public class ValorMaximo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe tr�s valores de ponto flutuante separando por espa�os:");
		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		double numero3 = entrada.nextDouble();
		
		double resultado = maximo(numero1, numero2, numero3);
		
		System.out.println("O maior n�mero �: " + resultado);
	}
	
	public static double maximo(double x, double y, double z) {
		
		double valorMaximo = x;
		
		if(y > valorMaximo)
			valorMaximo = y;
		
		if(z > valorMaximo)
			valorMaximo = z;
		
		return valorMaximo;
		
	}

}
