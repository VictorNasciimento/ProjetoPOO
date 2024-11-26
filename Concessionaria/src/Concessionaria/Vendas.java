package Concessionaria;

public class Vendas {

	private Cliente cliente;
	private Veiculos veiculo;
	private String dataVenda;

	public Vendas() {
		super();
	}

	public Vendas(Cliente cliente, Veiculos veiculo, String dataVenda) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public void realizarVenda() {
		System.out.println("Venda realizada com sucesso!");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cliente);
		System.out.println(veiculo);
		System.out.println(dataVenda);
	}
}
