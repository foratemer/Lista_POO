import java.util.Scanner;

public class Exercicio_2_15 {
		public static void main(String[] args){
			Scanner scan = new Scanner (System.in);
			
			
				
			System.out.println("Qual operação deseja fazer?\n 1 - Soma\n 2 - Diferença\n 3 - Produto\n 4 - Quociente");
			int operação = scan.nextInt();
			
			
			System.out.println("Informe o Primeiro Numero: ");
			float n1 = scan.nextInt();
			
			System.out.println("Informe o Segundo valor: ");
			float n2 = scan.nextInt();
			
			
			if(operação == 1){
				System.out.println("A soma dos valores é:  " + (n1+n2));
			}
			
			if(operação == 2){
				System.out.println("A Diferença dos valores é:  " + (n1-n2));
			}
			if(operação == 3){
				System.out.println("O Produto dos valores é: " + (n1*n2));
			}
			if(operação == 4){
				System.out.println("O quociente dos valores é: " + (n1/n2));
			}
	
			
			}
		}
