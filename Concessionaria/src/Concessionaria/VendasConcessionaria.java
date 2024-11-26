package Concessionaria;

public class VendasConcessionaria {

	public static void main(String[] args) {
	
		Concessionaria concessionaria = new Concessionaria("VeiculosPrime");
		
		Veiculos carro = new Veiculos("RAM", "Dodge", "10000", 500000.00, "Azul", 2024);
		Veiculos moto = new Veiculos("Honda", "XRE-300", "5000", 22000.00,"Preta", 2022);
		
		Cliente cliente = new Cliente("Roberto Gomes", "148.597.785-21", "(81)99475-5002","Av.Agamenon Magalhães");
		Cliente cliente2 = new Cliente("Karine Alves", "199.781.150.08", "(81)99810-2564","Av.Jõao de Barros");
		
		concessionaria.realizarVenda(cliente, carro, "14/05/2024");
		concessionaria.realizarVenda(cliente, moto, "26/11/2024");
		
        
		
	}

}
