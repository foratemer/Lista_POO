package pega;

import java.util.Scanner;

public class Exercicio_2_25 {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Usuário, digite um número inteiro: ");
		int inteiro = scan.nextInt();
		
		if(inteiro % 2 == 0){
			System.out.println("O número digitado é PAR!\n");
		}
		if(inteiro % 2 == 1){
			System.out.println("O número digitado é ÍMPAR!\n");
		}
		
		
		
	}
	
}
