package Cap_3;

public class Invoice {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String numero, String descricao, int quantidade, double preco, double invoiceAmount){
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNumero(){
		return numero;
	}
	public void setNome(){
		this.numero = numero;
	}
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(){
		this.descricao = descricao;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(){
		if(quantidade > 0)
		this.quantidade = quantidade;
		else{
			quantidade = 0;
		}
	}
	
	public double getPreco(){
		return preco;
	}
	public void setPreco(){
		if(preco > 0)
		this.preco = preco;
		else{
			preco = 0;
		}
	}
	
	public double getInvoiceAmount(){
		return getQuantidade() *getPreco();
		
	}	
		public void resultado(){
		
			System.out.println("Número da fatura: "+numero);
			System.out.println("Descrição do produto: "+descricao);
			System.out.println("Quantidade do produto: "+quantidade);
			System.out.println("Preço do produto: "+preco);
			System.out.println("Custo total:  "+getInvoiceAmount());
		}
	
	
	
	
		
	}
	
