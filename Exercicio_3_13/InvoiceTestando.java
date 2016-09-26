package Cap_3;

import java.util.Scanner;

public class Testando {

	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Número da fatura: ");
		String numero = scan.nextLine();
		
		System.out.println("Descrição do produto: ");
		String descricao = scan.nextLine();
		
		System.out.println("Quantidade do produto: ");
		int quantidade = scan.nextInt();
		
		System.out.println("Preço do produto: ");
		double preco = scan.nextInt();
		
		Invoice i = new Invoice (numero, descricao, quantidade, preco, preco);
		
		i.resultado();
		
	
		
		
	}
	
	
	
}
