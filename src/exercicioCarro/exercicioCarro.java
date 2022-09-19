package exercicioCarro;

public class exercicioCarro {
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setMarca("FIAT"); 
		c1.setModelo("Palio");
		c1.setPortas(4);
		c1.setPreco(15000f);
		
		System.out.println("Carro é da marca: " + c1.marca + "\ndo modelo: " + c1.modelo + 
				"\nQuantidade de portas: " + c1.portas);
		c1.statusMotor();
		c1.statusMovimento();
	
	}
	


}
