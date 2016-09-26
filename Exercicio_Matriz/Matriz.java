package Poo;

import java.util.Scanner;

public class Matriz {

	public static void main(String args[]) {

		int coluna;
		int linha;
		int[][] matriz1;
		int[][] matriz2;
		double[][] m3 = null;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a Linha da Matriz 1: ");
		linha = scan.nextInt();

		System.out.print("Digite a Colunada Matriz 1: ");
		coluna = scan.nextInt();

		matriz1 = new int[linha][coluna];

		System.out.print("Digite a Linhada Matriz 2: ");
		linha = scan.nextInt();

		System.out.print("Digite a Colunada Matriz 2: ");
		coluna = scan.nextInt();

		matriz2 = new int[linha][coluna];

		for (int i = 0; i < matriz1.length; i++) {
			for (int t = 0; t < matriz1.length; t++) {
				System.out
						.println("Digite um valor para a matriz 1  e elemento "
								+ (i + 1) + "" + (t + 1) + ": ");
				matriz1[i][t] = scan.nextInt();

			}

		}
		for (int i = 0; i < matriz2.length; i++) {
			for (int t = 0; t < matriz2[0].length; t++) {
				System.out
						.println("Digite um valor para a Matriz 2 e elemento  "
								+ (i + 1) + " " + (t + 1) + ": ");
				matriz2[i][t] = scan.nextInt();
			}
		}

		System.out.print("Sua Matriz1 é:\n");

		for (int i = 0; i < matriz1.length; i++) {
			for (int t = 0; t < matriz1.length; t++) {
				System.out.print(matriz1[i][t] + " ");

			}

			System.out.println();

		}
		System.out.print("Sua matriz2 é :\n");

		for (int i = 0; i < matriz2.length; i++) {
			for (int t = 0; t < matriz2[0].length; t++) {
				System.out.print(matriz2[i][t] + " ");

			}
			System.out.println();

		}

		if (matriz1[0].length == matriz2.length) {

			m3 = new double[matriz1.length][matriz2[0].length];

			for (int i = 0; i < m3.length; i++) {

				for (int j = 0; j < m3[0].length; j++) {

					for (int k = 0; k < matriz1[0].length; k++) {

						m3[i][j] += matriz1[i][k] * matriz2[k][j];

					}
				}
			}

			System.out.print("Sua matriz 3 é :\n");
			for (int i = 0; i < m3.length; i++) {
				for (int j = 0; j < m3[0].length; j++) {
					System.out.print(m3[i][j] + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("Não é possível a multiplicação!");
		}

	}
}