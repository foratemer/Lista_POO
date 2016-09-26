import java.util.Scanner;
public class Exercicio_2_24 {

		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Informe o Número: ");
			int n1 = scan.nextInt();
			int a=0;
			int n3=n1;				
			while (a < 4){
				
				System.out.println("Informe o  Número: ");
				
				int n2=scan.nextInt();
				 if(n2>n1){
					n1 = n2;
					
					
				}
				if(n2<n3){
					n3 = n2;
				}
				a++;
			}
			System.out.println("O maior é: " + n1);
			System.out.println("O menor é: " + n3);	

	}

}
   