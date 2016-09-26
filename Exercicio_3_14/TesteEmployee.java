package coisa;

import java.util.Scanner;

public class TesteEmployee {

	public static void main (String args[]){
		Employee e;
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.println("Valor mensal: ");
		double valorMensal = scan.nextInt();
		
		
		if (valorMensal > 0){
			
			e = new Employee(nome, sobrenome, valorMensal);
			System.out.println("Salario Mensal: "+e.getSalario());
			System.out.println("Salario Anual: "+(e.aumento(valorMensal)*12));
			
					
		} else{
			e = new Employee(nome, sobrenome, valorMensal);
			System.out.println("Salario Mensal: "+e.getSalario());
			System.out.println("Salario Anual: "+(e.getSalario()*12));
		}
		
		
	}
	
	
	
	
	
}
