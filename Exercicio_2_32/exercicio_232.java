package exercicio_232;

import javax.swing.JOptionPane;

public class exercicio_232 {

	public static void main(String[] args) {
		String numero; 
		int num, maior = 0, igual = 0, menor = 0;
		
		for(int i = 0; i < 5; i++) {
			numero = JOptionPane.showInputDialog("Digite o número");
			num = Integer.parseInt(numero);
			if(num > 0) {
				maior++;
			} else if(num == 0) {
				igual++;
			} else if(num < 0) {
				menor++;
			}

		}
		JOptionPane.showMessageDialog(null, maior+" número maior que 0\n"+igual+" número igual a 0\n"+menor+" número menor que 0");		
	}
	
	

	}


