package pega;

import java.util.Scanner;

public class Exercicio_2_30 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				
			
		System.out.println("Usuário, por favor, digite 5 números!");
		
		System.out.println("Digite o primeiro digito: ");
		int primeiroDigito = scan.nextInt();
		
		System.out.println("Digite o segundo digito: ");
		int segundoDigito = scan.nextInt();
		
		System.out.println("Digite o terceiro digito: ");
		int terceiroDigito = scan.nextInt();
		
		System.out.println("Digite o quato digito: ");
		int quartoDigito = scan.nextInt();
		
		System.out.println("Digite o quinto digito: ");
		int quintoDigito = scan.nextInt();
		
		System.out.println("   "+primeiroDigito+"  "+segundoDigito+"  "+terceiroDigito+"  "+quartoDigito+"   "+quintoDigito);
		
		
		
		
	}

}