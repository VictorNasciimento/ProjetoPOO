package Concessionaria;

public class Veiculos {

	private String marca;
	private String modelo;
	private String kM;
	private double preco;
	private String cor;
	private int dataFabricacao;

	public Veiculos() {
		super();
	}

	public Veiculos(String marca, String modelo, String kM, double preco, String cor, int dataFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kM = kM;
		this.preco = preco;
		this.cor = cor;
		this.dataFabricacao = dataFabricacao;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getkM() {
		return kM;
	}

	public void setkM(String kM) {
		this.kM = kM;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;

	}

	public int getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(int dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	

	public void acelerar() {

	}

	public void frear() {

	}

	public String toString() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: R$" + preco; 
	}
}
