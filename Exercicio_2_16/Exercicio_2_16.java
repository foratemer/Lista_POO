
import java.util.Scanner;

public class Exercicio_2_16 {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o Segundo valor: ");
		int segundoNumero = scan.nextInt();
		
		if (primeiroNumero == segundoNumero){
		System.out.println("These numbers are equal! ");
		
		}
		
		else {
			System.out.println("Os Numeros são Diferentes! ");
			
		}
		
		if (primeiroNumero > segundoNumero ){
			System.out.println("Is larger " + primeiroNumero); 
			
		}
		
					
			
		
	}

}