import java.util.Calendar;

public class HeartRates {
	static Calendar cal = Calendar.getInstance();
	static int anoAtual = cal.get(Calendar.YEAR);
	static int mesAtual = cal.get(Calendar.MONTH);
	static int diaAtual = cal.getMaximum(Calendar.DAY_OF_MONTH);
	
	private String nome, sobreNome;
	private int dia, mes, ano;
	
	public HeartRates(String nome, String sobreNome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public static int calculoIdade(int ano) {
		int idade = anoAtual - ano;
		return idade;	
	}
	public static int frequenciaMaxima(int idade) {
		int frequencia = 220 - idade;
		return frequencia;
	}
	public static double[] frequenciaAlvo(int frequencia) {
		double[] calculo = new double[2];
		calculo[0] = (frequencia * 50) / 100;
		calculo[1] = (frequencia * 85) / 100;
		return calculo;
	}
}


