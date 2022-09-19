package exercicioCarro;

public class Carro {
	
	//atributos
	public String marca;
	public String modelo;
	public int portas;
	public float preco;
	public boolean ligado;
	public boolean andando;

	//construtor	
	public Carro() {
		this.ligado = false;
		this.andando = true;
		this.ligar();
		this.desligar();
		this.acelerar();
		this.frear();
	
	}
	
	// métodos acessores e modificadores para a classe Carro
	
	 public String getMarca(){
		 return this.marca;
	 }
	 
	 public void setMarca(String m){
		 this.marca = m;
	 }
	 
	 public String getModelo(){
		 return this.modelo;
	 }
	 
	 public void setModelo(String mod){
		 this.modelo = mod;
	 }
	 
	 public int getPortas(){
		 return this.portas;
	 }
	 
	 public void setPortas(int p){
		 this.portas = p;
	 }
	 
	 public float getPreco(){
		 return this.preco;
	 }
	 
	 public void setPreco(float valor){
		 this.preco = valor;
	 }
	 
	 public boolean getLigado(){
		 return this.ligado;
	 }
	 
	 public boolean setLigado(boolean lig) {
		 return this.ligado = lig;
	 }
	 
	
	 public boolean getAndando(){
		 return this.andando;
	 }
	 
	 public boolean setAndando(boolean mov) {
		 return this.andando = mov;
	 }
	 
	 //métodos para a classe Carro
	 public void ligar() {
		 this.ligado = true;
		 
		 
	 }
	 
	 public void desligar() {
		 this.ligado = false;
		 
	 }
	 
	 public void acelerar() {
		 this.andando = false;
		 	
	 }
	 
	 public void frear() {
		 this.andando = true;
		 
	 }
	 
	 public void statusMotor() {
		 if(this.ligado = true) {
			 System.out.println("O carro está ligado");
		 } else {
			 System.out.println("O carro está desligado.");
		 }
	 }
		
	 public void statusMovimento() {
		 if(this.andando = false) {
			 System.out.println("O carro está parado, pode acelerar.");
		 } else { 		 		 
			 System.out.println("O carro está andando, pode frear.");
		 }
		 
	 }
}