package vendaDeCarro;

public class Carro {
	//marca modelo ano
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	private double desconto;
	
	public Carro (String marca, String modelo, int ano, double valor, double desconto) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.desconto = desconto;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
