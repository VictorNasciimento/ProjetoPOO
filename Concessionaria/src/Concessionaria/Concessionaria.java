package Concessionaria;

public class Concessionaria {

	private String nome;

	public Concessionaria() {
		super();
	}

	public Concessionaria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void realizarVenda(Cliente cliente, Veiculos veiculo, String dataVenda) {
		Vendas venda = new Vendas(cliente, veiculo, dataVenda);
		venda.realizarVenda();

	}

}
