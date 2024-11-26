package Concessionaria;

public class Moto extends Veiculos {

	public Moto() {
		super();

	}

	public Moto(String marca, String modelo, String kM, double preco, String cor, int dataFabricacao) {
		super(marca, modelo, kM, preco, cor,dataFabricacao);

	}

	@Override
	public void acelerar() {
		
	}
}
