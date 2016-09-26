package cap3;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		
		System.out.print("Informe o dia: ");
		dia = scan.nextInt();
		System.out.print("Informe o mês: ");
		mes = scan.nextInt();
		System.out.print("Informe o ano: ");
		ano = scan.nextInt();
		
		Date date = new Date(dia, mes, ano);
		
		date.displayDate();

	}
}