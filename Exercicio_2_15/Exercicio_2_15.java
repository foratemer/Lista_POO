import java.util.Scanner;

public class Exercicio_2_15 {
		public static void main(String[] args){
			Scanner scan = new Scanner (System.in);
			
			
				
			System.out.println("Qual opera��o deseja fazer?\n 1 - Soma\n 2 - Diferen�a\n 3 - Produto\n 4 - Quociente");
			int opera��o = scan.nextInt();
			
			
			System.out.println("Informe o Primeiro Numero: ");
			float n1 = scan.nextInt();
			
			System.out.println("Informe o Segundo valor: ");
			float n2 = scan.nextInt();
			
			
			if(opera��o == 1){
				System.out.println("A soma dos valores �:  " + (n1+n2));
			}
			
			if(opera��o == 2){
				System.out.println("A Diferen�a dos valores �:  " + (n1-n2));
			}
			if(opera��o == 3){
				System.out.println("O Produto dos valores �: " + (n1*n2));
			}
			if(opera��o == 4){
				System.out.println("O quociente dos valores �: " + (n1/n2));
			}
	
			
			}
		}
