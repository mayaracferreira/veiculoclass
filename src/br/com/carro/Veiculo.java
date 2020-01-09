package br.com.carro;

public class Veiculo {
	// atributos
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean ligado;
	private int litroscombustivel;
	private int velocidade;
	private double preco;

	// metodos

	void status() {
		System.out.println("Um veiculo " + this.marca);
		System.out.println("modelo: " + this.modelo);
		System.out.println("placa: " + this.placa);
		System.out.println("cor: " + this.cor);
		System.out.println("Está ligado ? " + this.ligado);
		System.out.println("litroscombustivel: " + this.litroscombustivel);
		System.out.println("velocidade: " + this.getVelocidade());
		System.out.println("Preço: " + this.preco);
	}

	void acelerar() {
		if (this.ligado == true) {
			this.velocidade += 20;
			this.litroscombustivel -= 1;

		} else {
			System.out.println(" Não é possível acelerar com o carro desligado");
		}

	}

	void abastecer(int lts) {
		if (this.litroscombustivel + lts  > 100) {
			
			System.out.println(" o carro excedeu o limite de combustível de 100 litros.");
			System.out.println(" Quantidade de combustivel atual:" + this.litroscombustivel);

	
		} else {
			this.litroscombustivel += lts;
			System.out.println("O carro está abastecido com: " + this.litroscombustivel + " litros de combustivel");		

		}
	}

	void frear() {
		if (this.ligado == true && this.velocidade > 0) {
			this.velocidade -= 10;	
	}
	    else {
	    	System.out.println("Não é possível acelerar com o carro desligado");
		
	    }
	}

	void pintar(String cor) {
		this.cor = cor;
		System.out.println("A cor do veiculo foi alterada para" + this.cor);

	}

	void ligar() {
		if (this.ligado == true) {
			System.out.println("O carro já está ligado");	
		}	
		else {
			this.ligado = true;
			System.out.println("Ligando o carro");
		}
			
	}

	void desligar() {
		if (this.ligado == false) {
			System.out.println("O carro está desligado");
		}
		else {
			this.ligado = false;
			System.out.println("desligando o carro");
		}

	}

	public Veiculo() {

	}

	// construtores
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean ligado,
			int litroscombustivel, int velocidade, double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.ligado = true;
		this.litroscombustivel = litroscombustivel;
		this.velocidade = 0;
		this.preco = preco;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getLitroscombustivel() {
		return litroscombustivel;
	}

	public void setLitroscombustivel(int litroscombustivel) {
		this.litroscombustivel = litroscombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(String string) {
		this.preco = preco;
	}

	public void setLigado(String string) {
		// TODO Auto-generated method stub

	}

	public void setLitroscombustivel(String string) {
		// TODO Auto-generated method stub

	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setLigado() {
		// TODO Auto-generated method stub
		
	}

}
