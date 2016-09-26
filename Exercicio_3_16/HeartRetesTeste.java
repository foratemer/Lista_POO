import javax.swing.JOptionPane;

public class HeartRetesTeste {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "CALCULADORA DE FREQUÊNCIA CARDIACA");
		String nome = JOptionPane.showInputDialog("DIGITE O SEU NOME: ");
		String sobreNome = JOptionPane.showInputDialog("DIGITE O SEU SOBRENOME: ");
		JOptionPane.showMessageDialog(null, "DIGITE A DATA DO SEU NASCIMENTO");
		int dia = Integer.parseInt(JOptionPane.showInputDialog("DIA DO NASCIMENTO: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("MÊS DO NASCIMENTO: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("ANO DO NASCIMENTO: "));
		
		HeartRates frequencia = new HeartRates(nome, sobreNome, dia, mes, ano);
		int idade = HeartRates.calculoIdade(ano);
		int frequenciaMaxima = HeartRates.frequenciaMaxima(idade);
		double[] frequenciaAlvo = HeartRates.frequenciaAlvo(frequenciaMaxima);
		
		
		JOptionPane.showMessageDialog(null, "NOME: "+frequencia.getNome()+
				"\nSOBRENOME: "+frequencia.getSobreNome()+
				"\nDATA DE NASCIMENTO:"+frequencia.getDia()+"/"+frequencia.getMes()+"/"+frequencia.getAno()+
				"\nIDADE: "+idade+"\nFREQUÊNCIA CARDIACA: "+frequenciaMaxima+"\nFREQUÊNCIA ALVO: "+"["+frequenciaAlvo[0]+"] ["+frequenciaAlvo[1]+"]");
	}

}


